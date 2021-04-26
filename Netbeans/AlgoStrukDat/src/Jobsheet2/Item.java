/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author MeiMei
 */
public class Item {

    String nameItem, typeItem;
    int stock, unitPrice;

    Item() {

    }

    Item(String nm, String tp_item, int st, int un_price) {
        nameItem = nm;
        typeItem = tp_item;
        stock = st;
        unitPrice = un_price;
    }

    void PrintItem() {
        System.out.println("Name = " + nameItem);
        System.out.println("Type = " + typeItem);
        System.out.println("Stock = " + stock);
        System.out.println("The Unit Price = " + unitPrice);
    }

    void addStock(int n) {
        stock = stock + n;
    }

    void reduceStock(int n) {
        if (stock > 0) {
            stock = stock - n;
        } else {
            System.out.println("You can't reducing stock");
        }
    }

    int totalPrice(int total) {
        return total * unitPrice;
    }
}
