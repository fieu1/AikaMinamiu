/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;
import java.util.Scanner;

/**
 *
 * @author MeiMei
 */
public class PersegiPanjangMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }
         for (int i = 0; i < 3; i++) {
             System.out.println("Persegi panjang ke-"+i+ ", panjang : " + ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
         }
    }
}
