/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author USER
 */
public class customer {
    public String accountNum;
    public String name;
    
    public customer(String accNum,String nm){
        accountNum=accNum;
        name=nm;
    }
    
    public customer(){
        
    }
    
    public void print(){
        System.out.println("Number Account  = "+accountNum);
        System.out.println("Name            = "+name);
        System.out.println();
    }
}
