/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapp;

/**
 *
 * @author Alexb
 */
public class Book {
    
    // varibles what defines a book
    private int id;
    private String title;
    private String author;
    private boolean available;
    
    // constructors 
    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }
    
    
    // getters and setters
    
    public int getId(){
        return id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public boolean isAvailable(){
        return available;
    }
    
    public void setAvailable(boolean available){
        this.available = available;
    }
}
