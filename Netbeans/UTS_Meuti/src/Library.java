/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MeiMei
 */
public class Library {

    Book listBook[];
    int idx, amBook;

    public Library() {
        
    }
    
    void add(Book b) {
        listBook = new Book[amBook];
        if (idx < listBook.length) {
            listBook[idx] = b;
            idx++;
        } else {
            System.out.println("Data is full!");
        }
    }

    void printSearch(Book b) {
            b.print();
            if(b.stock>0){
                System.out.println("This book is available");
            } else{
                System.out.println("Sorry, this book is unavailable");
            }
            System.out.println("======================================");

    }
    void printStock() {
        for (Book b : listBook) {
            b.print();
            if(b.stock>0){
                System.out.println("This book is available");
            } else{
                System.out.println("Sorry, this book is unavailable");
            }
            System.out.println("======================================");

        }
    }
    void bubbleSort() {
        Book temp;
        for (int i = 0; i < listBook.length; i++) {
            for (int j = 1; j < listBook.length - i; j++) {
                if (listBook[i].name.compareTo(listBook[j].name)>0) 
                {
                    temp = listBook[i];
                    listBook[i]= listBook[j];
                    listBook[j]= temp;
                }
            }
        }
    }
    public void FindSeqSearch(String search){
       
        for(int j=0;j< listBook.length;j++){
            if(listBook[j].name.equalsIgnoreCase(search)){
                printSearch(listBook[j]);
                break;
            } else{
                System.out.println("There's no book with those title");
            }
        }
    }
    public String Borrow(String title){
        String bookTitle = " ";
        for(int j=0;j< listBook.length;j++){
            if(listBook[j].name.equalsIgnoreCase(title)){
                if(listBook[j].stock > 0){
                    bookTitle = listBook[j].name;
                    listBook[j].stock-=1;
                } else{
                    System.out.println("Sorry, this book is unavailable");
                }
                break;
            }
        }
        return bookTitle;
    }
    public void Return(String title){
        for(int j=0;j< listBook.length;j++){
            if(listBook[j].name.equalsIgnoreCase(title)){
                    listBook[j].stock+=1;
                    System.out.println("Thank you for returning the book !");
                break;
            }
        }
        
    }
}
