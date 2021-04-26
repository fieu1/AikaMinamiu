/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4;
import java.util.Scanner;
/**
 *
 * @author Aikacchii
 */
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota(111333444, "Donny", 5000000);
        
        System.out.println("Nama Anggota : " + donny.getNama());
        System.out.println("Limit Pinjaman : " + donny.getLimitPinjaman());
        System.out.print("Jumlah uang dipinjam : ");
        int pinjaman = sc.nextInt();
        donny.pinjam(pinjaman);
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
        System.out.print("Jumlah angsuran : ");
        int angsuran = sc.nextInt();
        donny.angsur(angsuran);
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
        
        System.out.println("\nMengangsur uang 1.000.000...");
        donny.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
        
        System.out.println("\nMengangsur uang 3.000.000...");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
        
    }
}
