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
public class Try {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        System.out.println("WELCOME TO THIS EXPEDITION");
        System.out.println("INPUT SENDER NAME");
        System.out.print("> ");
        String senderName = scs.nextLine();
        System.out.println("INPUT SENDER CITY");
        System.out.print("> ");
        String senderCity = scs.nextLine();
        System.out.println("INPUT SENDER STATE");
        System.out.print("> ");
        String senderState = scs.nextLine();
        System.out.println("INPUT SENDER PHONE");
        System.out.print("> ");
        String senderNoPhone = scs.next();
        System.out.println("HOW MANY TRANSACTION DO YOU WANT?");
        System.out.print("> ");
        int transaction = sc.nextInt();
        
        

        String receiverName[] = new String[transaction];
        String receiverCity[] = new String[transaction];
        String receiverState[] = new String[transaction];
        String receiverNoPhone[] = new String[transaction];
        String jenisBarang[] = new String[transaction];
        String jenisLayanan[] = new String[transaction];
        int totalHarga[] = new int[transaction];
        int beratBarang[] = new int[transaction];

        for (int i = 0; i < transaction; i++) {
            System.out.println();
            System.out.println("INPUT RECEIVER "+ (i+1) +" NAME");
            System.out.print("> ");
            receiverName[i] = scs.nextLine(); //fix 
            System.out.println("INPUT RECEIVER CITY");
            System.out.print("> ");
            receiverCity[i] = scs.nextLine();
            System.out.println("INPUT RECEIVER STATE");
            System.out.print("> ");
            receiverState[i] = scs.nextLine();
            System.out.println("INPUT RECEIVER PHONE");
            System.out.print("> ");
            receiverNoPhone[i] = scs.next();
            System.out.println("INPUT TYPE OF GOODS");
            System.out.print("> ");
            jenisBarang[i] = scs.nextLine(); //fix
            System.out.println("INPUT WEIGHT OF GOODS");
            System.out.print("> ");
            beratBarang[i] = sc.nextInt();
            System.out.println("INPUT SERVICE TYPE (EKO, REG, KILAT)");
            System.out.print("> ");
            jenisLayanan[i] = scs.next();
            
            int hargaDariLokasi = checkHargaBerdasarkanLokasi(receiverCity[i], receiverState[i], senderCity, senderState);
            int hargaDariBerat = checkHargaBerdasarkanBerat(beratBarang[i]);
            int hargaDariLayanan = checkHargaBerdasarkanLayanan(jenisLayanan[i]);
            totalHarga[i] = hargaDariBerat + hargaDariLayanan + hargaDariLokasi;
            cetakResi(receiverName[i], senderName, receiverNoPhone[i], senderNoPhone, receiverCity[i], receiverState[i],
                    senderCity, senderState, jenisBarang[i], jenisLayanan[i], beratBarang[i], totalHarga[i]);
        }
    }
    
    public static int checkHargaBerdasarkanLokasi(String receiverCity, String receiverState, String senderCity, String senderState){
        int hargaOngkir = 0;
        
        
        if(hargaOngkir == 0)
        if(receiverState.equalsIgnoreCase(senderState)){
            if(receiverCity.equalsIgnoreCase(senderCity)){
                hargaOngkir = 5000;
            } else {
                hargaOngkir = 7500;
            }
        } else {
            hargaOngkir = 15000;
        }
        return hargaOngkir;
    }
    
    public static int checkHargaBerdasarkanLayanan(String jenisLayanan){
        int hargaLayanan = 0;
        
        if(jenisLayanan.equalsIgnoreCase("REG")){
            hargaLayanan = 15000;
        } else if(jenisLayanan.equalsIgnoreCase("EKO")) {
            hargaLayanan = 10000; 
        } else if(jenisLayanan.equalsIgnoreCase("KILAT")){
            hargaLayanan = 20000;
        }
        return hargaLayanan;
    }
    
    public static int checkHargaBerdasarkanBerat(int beratBarang){
        return beratBarang*1500;
    }
    
    public static void cetakResi(String receiverName, String senderName,String receiverPhone, String senderPhone, String receiverCity,
            String receiverState, String senderCity, String senderState, String jenisBarang,
            String jenisLayanan, int beratBarang, int totalHarga){
        System.out.println("===================================");
        System.out.println("              RESI");
        System.out.println("===================================");
        System.out.println("Nama Pengirim \t=" + senderName);
        System.out.println("Telepon Pengirim \t=" + senderPhone);
        System.out.println("Kota Pengirim \t=" + senderCity);
        System.out.println("Provinsi Pengirim \t=" + senderState);
        System.out.println("Nama Penerima \t=" + receiverName);
        System.out.println("Telepon Penerima \t=" + receiverPhone);
        System.out.println("Kota Penerima \t=" + receiverCity);
        System.out.println("Provinsi Penerima \t=" + receiverState);
        System.out.println("Jenis Barang \t=" + jenisBarang);
        System.out.println("Berat Barang \t=" + beratBarang + " Kg");
        System.out.println("Jenis Layanan \t=" + jenisLayanan);
        System.out.println("Total Harga \t=" + totalHarga);
    }
}
