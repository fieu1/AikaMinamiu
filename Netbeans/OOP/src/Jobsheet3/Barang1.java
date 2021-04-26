/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

/**
 *
 * @author Aikacchii
 */
public class Barang1 {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual(){
        float sellingPrice = hargaDasar - (diskon*hargaDasar);        
        return (int)sellingPrice;
    }
    
    public void showData(){
        System.out.println("Kode " + kode);
        System.out.println("Nama Barang " + namaBarang);
        System.out.println("Harga Dasar Rp" + hargaDasar);
        System.out.println("Diskon " + diskon);
        System.out.println("hargaJual " + hitungHargaJual());
                
    }
    
    public static void main(String[] args) {
        Barang1 br = new Barang1();
        br.kode="101";
        br.namaBarang="Stylus";
        br.hargaDasar=100000;
        br.diskon = 0.3f;
        br.showData();
    }
}
