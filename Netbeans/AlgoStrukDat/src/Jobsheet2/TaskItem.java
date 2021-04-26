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
public class TaskItem {
    String name;
    int unitPrice, total;
    public TaskItem(String n, int u, int t){ //parameter constructor
        name = n; //change name value
        unitPrice = u; //change unit price value
        total = t; //change total value
    }
    int totalPrice(){ //calculate total method
       return unitPrice*total; //return value
    }
    double discount; //for calculate dicsount
    int dis; //to make discount interger
    int Discount(){ //calculate discount method
        if(totalPrice()>100000){ //condition 
            discount = totalPrice()*0.1; //calculate discount
        } else if(totalPrice()>=50000 && totalPrice()<=100000){ //condition
            discount = totalPrice()*0.05; //calculate discount
        } else { //other condition 
            discount = 0; //not get discount
        }
        dis=(int)discount; //make discount being an interger
    return dis; //return value
    }
    int pricePaid(){ //calculate price to paid
        return totalPrice()-Discount(); //return value
    }
}
