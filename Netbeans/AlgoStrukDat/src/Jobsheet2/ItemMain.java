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
public class ItemMain {

    public static void main(String[] args) {
        Item bl = new Item();
        bl.nameItem = "Laptop ASUS ";
        bl.typeItem = "Core i7";
        bl.unitPrice = 5000000;
        bl.stock = 10;
        bl.addStock(1);
        bl.reduceStock(3);
        int price = bl.totalPrice(4);
        bl.PrintItem();
        System.out.println("Price for 4 laptop is " + price);
        Item b2 = new Item("Laptop Toshiba", "Core i5", 25, 7000000);
        b2.PrintItem();
        Item b3 = new Item("Laptop HP", "AMD Ryzen", 20, 4500000);
    }

}
