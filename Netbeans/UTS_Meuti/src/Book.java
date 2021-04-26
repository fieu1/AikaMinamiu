/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MeiMei
 */
public class Book {
    String name, author;
    int stock;

    public Book(String name, String author, int stock) {
        this.name = name;
        this.author = author;
        this.stock = stock;
    }
    
    void print() {
        System.out.println("Name = " + name);
        System.out.println("Author = " + author);
        System.out.println("stock = " + stock);
        
    }
}
