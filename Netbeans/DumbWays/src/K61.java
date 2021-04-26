
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Aikacchii
 */
public class K61 {

    public static void main(String[] args) {
        int total, pay;
        Scanner sc = new Scanner(System.in);
        System.out.print("Total : ");
        total = sc.nextInt();
        System.out.print("Pay : ");
        pay = sc.nextInt();
        Calculate(total, pay);
    }

    static void Calculate(int total, int pay) {
        int returning = pay - total;
        int amount50 = 0, amount20 = 0, amount10 = 0, amount5 = 0;
        do {
            if (returning >= 50000) {
                amount50 = returning / 50000;
                returning = returning - (amount50 * 50000);
            } else if (returning >= 20000) {
                amount20 = returning / 20000;
                returning = returning - (amount20 * 20000);
            } else if (returning >= 10000) {
                amount10 = returning / 10000;
                returning = returning - (amount10 * 10000);
            } else if (returning >= 5000) {
                amount5 = returning / 5000;
                returning = returning - (amount5 * 5000);
            }
        } while (returning >= 5000);
        
        System.out.println(amount50 + "X 50.000");
        System.out.println(amount20 + "X 20.000");
        System.out.println(amount10 + "X 10.000");
        System.out.println(amount5 + "X 5.000");
        System.out.println("Donate " + returning);
    }
}
