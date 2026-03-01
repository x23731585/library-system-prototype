/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapp;
import java.time.LocalDate;

/**
 *
 * @author Alexb
 */
public class Loan {
    
    private Book book;
    private LocalDate issueDate;
    private LocalDate dueDate;
    
    public Loan(Book book, LocalDate issueDate, LocalDate dueDate){
        this.book = book;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }
    
    public Book getBook(){
        return book;
    }
    
    public LocalDate getIsuueDate(){
        return issueDate;
    }
    
     public LocalDate getDueDate(){
        return dueDate;
    }
    
}
