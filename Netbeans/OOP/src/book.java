/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aikacchii
 */
public class book {
    String title, author;
    int bookID, available_book;

    public void inputBook(String ttl, String athr, int bID, int ava) {
        title = ttl;
        author = athr;
        bookID = bID;
        available_book = ava;
    }

    public void borrowed(int amount) {
        available_book = available_book - amount;
    }

    public void returned(int amount) {
        available_book = available_book + amount;
    }

    public void showStatus() {
        System.out.println("book ID : " + bookID);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Available book : " + available_book);
    }
}
