/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libraryapp;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

/**
 *
 * @author Alexb
 */

    /**
     * @param args the command line arguments
     */
public class LibraryApp {
   
    //array lsits to store, login, book and loan info
    private List<Book> books =  new ArrayList<>();
    private List<Member> members =  new ArrayList<>();
    private List<Loan> loans =  new ArrayList<>();
    
    public LibraryApp(){
        members.add(new Member("Alex", "1234"));
        members.add(new Member("desmond", "1234"));
        
        books.add(new Book(1,"The great escape", "David Laid"));
        books.add(new Book(2, "How to Code 2.0", "Anthony Hemsworth"));
        books.add(new Book(3,"Master your Phsycology", "Ethan Bordwin"));
        books.add(new Book(4,"The Human Mind ", "Alex shaw"));
        books.add(new Book(5,"Emotions Cloud Judgment", "Tyler Perry"));
        books.add(new Book(6,"Think Before You DO ", "Jennifer Lorence"));
        books.add(new Book(7,"Rate Race", "Andrew Tate"));
    }
    
    //check login details
    public boolean login(String username, String password){
        for (Member m : members) {
            if (m.getUsername().equalsIgnoreCase(username.trim())
                    && m.getPassword().equals(password)) {
                return true;
            }
    }
        return false;
    }
    
        
    //search books by title
    public List<Book> searchBooks(String title) {

    List<Book> results = new ArrayList<>();

    for (Book b : books) {
        if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
            results.add(b);
        }
    }

    return results;
    }
    
    //search all books
    public List<Book> getAllBooks(){
        return books;
    }
    
    
    // if the id matches with the book id and its not available nothing happens
    //if its available its set to not availabe and creates and loan record
    public Loan borrowBook(int bookId){
        for(Book b : books){
            if (b.getId() == bookId){
                if(!b.isAvailable()) return null;
                
                b.setAvailable(false);
                Loan loan = new Loan(b, LocalDate.now(), LocalDate.now().plusDays(14));
                loans.add(loan);
                return loan;
            }
        }
        return null;
    }
    
}
