/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PunyaAlwi;

/**
 *
 * @author MeiMei
 */
import java.util.Scanner;
public class assign4 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Scanner input2 = new Scanner(System.in);
         System.out.print("Jumlah Data : ");
         int amount=input.nextInt();
         int []ni=new int[amount];
         String []na=new String[amount];
         String []ad=new String[amount];
         String []ge=new String[amount];
         for(int i=0;i<amount;i++){
             System.out.println("Penduduk ke-"+(i+1));
             System.out.print("NIK : ");
             ni[i]=input.nextInt();
             System.out.print("Nama : ");
             na[i]=input2.nextLine();
             System.out.print("Alamat : ");
             ad[i]=input2.nextLine();
             System.out.print("Jenis Kelamin : ");
             ge[i]=input2.nextLine();
         }
         System.out.print("Masukkan NIK yang ingin dicari : ");
         int search=input.nextInt();
         sort4 data=new sort4(ni,na,ad,ge);
         data.find(search);
         data.print();
    }
}
