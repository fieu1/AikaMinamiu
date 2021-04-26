import java.util.Scanner;
public class FinalProject2 {
    static int kategoriTujuan(){
        Scanner sc = new Scanner (System.in);
        String kategori, layanan;
        int ongkir = 0;
        System.out.println("=================== KATEGORI PENGIRIMAN ======================");
        System.out.println("a) Antar Kota");
        System.out.println("b) Antar Provinsi");
        System.out.println("c) Antar Pulau");
        System.out.println("d) Antar Negara");
        System.out.print("Masukkan Kategori Pilihan : ");
        kategori = sc.nextLine();
        System.out.print("Masukkan jenis layanan (expres/reguler:");
        layanan = sc.nextLine();
        if(kategori.equalsIgnoreCase("a")){
           if(layanan.equalsIgnoreCase("expres")){
               ongkir = 50000;
           } else if(layanan.equalsIgnoreCase("reguler")){
               ongkir = 25000;
           } else {
               System.out.print("Jenis Layanan yang anda masukkan tidak sesuai");
           }
        } else if(kategori.equalsIgnoreCase("b")){
            if(layanan.equalsIgnoreCase("expres")){
                ongkir = 100000;
            } else if(layanan.equalsIgnoreCase("reguler")){
                ongkir = 75000;
            }else{
                System.out.print("Jenis Layanan yang anda masukkan tidak sesuai");
            }
        } else if(kategori.equalsIgnoreCase("c")){
            if(layanan.equalsIgnoreCase("expres")){
                ongkir = 150000;
            } else if(layanan.equalsIgnoreCase("reguler")){
                ongkir = 100000;
            }else{
                System.out.print("Jenis Layanan yang anda masukkan tidak sesuai");
            }
        } else if(kategori.equalsIgnoreCase("d")){
            if(layanan.equalsIgnoreCase("expres")){
                ongkir = 500000;
            }else if(layanan.equalsIgnoreCase("reguler")){
                ongkir = 300000;
            }else {
                System.out.print("Jenis Layanan yang anda masukkan tidak sesuai");
            }
        } else{
            System.out.print("Kategori yang anda masukkan tidak sesuai");
        }
        return ongkir;
    }
    
    //diganti void aja, jadi cuma ngeprint
    static void Ratings(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Ratings 1-5 : ");
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        String namaPengirim, kecPengirim, kotPengirim, provPengirim, noPengirim;
        String feedback, status;
        Scanner sc = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);
        System.out.println("=========================== EKSPEDISI PENGIRIMAN BARANG ==================");
        System.out.print("Nama Pengirim :");
        namaPengirim = sc.nextLine();
        //alamatnya langsung masukin kecamatan dll
        System.out.print("Kecamatan Pengirim :");
        kecPengirim = sc.nextLine();
        System.out.print("Kecamatan Pengirim :");
        kotPengirim = sc.nextLine();
        System.out.print("Kecamatan Pengirim :");
        provPengirim = sc.nextLine();
        System.out.print("No.Telp Pengirim :");
        noPengirim = sc.nextLine();
        System.out.println("Berapa Kali Pengiriman yang diinginkan ?(Masukkan angka) ");
        int transaksi = sci.nextInt();
        
        String namaPenerima[] = new String[transaksi];
        String alamatPenerima[] = new String[transaksi];
        String noPenerima[] = new String[transaksi];
        String kecTujuan[] = new String[transaksi];
        String kotTujuan[] = new String[transaksi];
        String provTujuan[] = new String[transaksi];
        String jenisBarang[] = new String[transaksi];
        String kemas[] = new String[transaksi];
        int berat[] = new int[transaksi];
        
    for(int i = 0; i < transaksi; i++){
        System.out.print("Nama Penerima :");
        namaPenerima[i] = sc.nextLine();
        System.out.print("No.Telp Penerima:");
        noPenerima[i] = sc.nextLine();
        System.out.println("========================= DESTINASI TUJUAN ========================="); //buat input tujuan aja
        System.out.print("Kecamatan Tujuan:");
        kecTujuan[i] = sc.nextLine();
        System.out.print("Kota Tujuan:");
        kotTujuan[i] = sc.nextLine();
        System.out.print("Provinsi Tujuan:");
        provTujuan[i] = sc.nextLine();
        System.out.println("\n=============================================================");
        System.out.println("=================== Kategori Jenis Barang =====================");
        System.out.println("1) Jenis Elektronik(Cont: Televisi, dll");
        System.out.println("2) Jenis Farmasi(Cont: Obat-obatan, dll");
        System.out.println("3) Jenis Apparel(Cont: Pakaian, dll)");
        System.out.println("4) Jenis Food and Beverage(Cont: Makanan, dll");
        System.out.println("5) Jenis Kosmetik(Cont: Produk kecantikan, dll");
        System.out.println("6) Jenis Otomotif(Cont: Spare art, dll");
        System.out.print("Masukkan Kategori Jenis Barang : ");
        jenisBarang[i] = sc.nextLine();
        System.out.println("=========================== Berat Barang ======================");
        System.out.print("Masukkan Berat Barang (KG)");
        berat[i] = sci.nextInt();
        System.out.println("==================== Kategori Jenis Pengemasan ================");
        System.out.println("a) Pengemasan Plastik");
        System.out.println("b) Pengemasan Bubble Warp");
        System.out.println("c) Pengemasan Kardus");
        System.out.println("d) Pengemasan Karung");
        System.out.println("e) Pengemasan Kayu");
        System.out.println("f) Pengemasan Box Pendingin");
        System.out.print("Masukkan Jenis Pengemasan(Pilih salah satu huruf yang tersedia) :");
        kemas[i] = sc.nextLine();
        
        //sebenernya ngga kamu taruh di variabel pun bisa, misal kayak yang di case a sama kondisi switchnya aku ubah ya
        int beratTotal = 0;
        int bobot = berat[i];
        //kondisinya ini buat nyimpen pengemasannya pake apa 
        String kondisi = "";
        int ppn = 0, biayaTotal = 0;
        boolean ulang = false;
        
        do{
        switch(kemas[i]){
            case ("a"):
                kondisi = "Plastik";
                beratTotal = berat[i]*10000;
                ppn = beratTotal*10/100;
                biayaTotal = beratTotal + ppn;
            break;
            case ("b"):
                kondisi = "Bubble Wrap";
                beratTotal = bobot*20000;
                ppn = beratTotal*10/100;
                biayaTotal = beratTotal + ppn;
            break;
            case ("c"):
                kondisi = "Kardus";
                beratTotal = bobot*15000;
                ppn = beratTotal*10/100;
                biayaTotal = beratTotal + ppn;
            break;
            case ("d"):
                kondisi = "Karung";
                beratTotal = bobot*17000;
                ppn = beratTotal*10/100;
                biayaTotal = beratTotal + ppn;
            break;
            case ("e"):
                kondisi = "Kayu";
                beratTotal = bobot*30000;
                ppn = beratTotal*10/100;
                biayaTotal = beratTotal + ppn;
            break;
            case ("f"):
                kondisi = "Box Pendingin";
                beratTotal = bobot*25000;
                ppn = beratTotal*10/100;
                biayaTotal = beratTotal + ppn;
            break;
            default:
                System.out.println("Kategori yang anda masukkan tidak sesuai");
                ulang = true; //ditambahin ini biar kalo salah bisa input ulang
            break;
        }
        }while(ulang);
 
        int ongkir = kategoriTujuan();
        System.out.println("======================== Biaya Yang Harus di Bayar =============================");
        System.out.println("Total Biaya Kg : Rp."+beratTotal+",-");
        System.out.println("Biaya PPN 10% : Rp."+ppn+",-");
        System.out.println("Biaya Total Pengemasan : Rp."+biayaTotal+",-");
        System.out.println("Biaya Ongkir : Rp."+ongkir+",-");
        int totalPembayaran = (int)(biayaTotal + ongkir);
        System.out.println("Total Pembayaran :" + totalPembayaran);
        System.out.println("=================== Kategori Pembayaran =========================");
        String bayarVia;
        System.out.println("a) Via Link aja");
        System.out.println("b) Via Transfer ATM");
        System.out.println("c) Via Internet Banking");
        System.out.println("d) Via Minimarket");
        System.out.println("e) Via Wallet");
        System.out.print("Masukkan Kategori Pembayaran :");
        bayarVia = sc.nextLine();
        if(bayarVia.equalsIgnoreCase("a")){
            System.out.println("Pembayaran Via Link aja");
        }else if(bayarVia.equalsIgnoreCase("b")){
            System.out.println("Pembayaran Via Transfer ATM");
        }else if(bayarVia.equalsIgnoreCase("c")){
            System.out.println("Pembayaran Via Internet Banking");
        }else if(bayarVia.equalsIgnoreCase("d")){
            int biayaAdmin = 2000;
            System.out.println("Pembayaran Via Minimarket Dengan Biaya Admin Rp. 2000");
            totalPembayaran += biayaAdmin;
        }else if(bayarVia.equalsIgnoreCase("e")){
            System.out.println("Pembayaran Via Wallet");
        }else{
            System.out.println("Kategori Pembayaran yang anda masukkan tidak sesuai");
        }
        System.out.println("================= Cetak Resi ====================");
        System.out.println("Nama Pengirim :" + namaPengirim );
        System.out.println("Alamat Pengirim : ");
        System.out.println("Kecamatan : " + kecPengirim);
        System.out.println("Kota : "+ kotPengirim);
        System.out.println("Provinsi : "+ provPengirim);
        System.out.println("No. Telp Pengirim : " + noPengirim);
        System.out.println("Nama Penerima : " + namaPenerima[i]);
        System.out.println("Alamat Penerima : ");
        System.out.println("Kecamatan : " + kecTujuan[i]);
        System.out.println("Kota : "+ kotTujuan[i]);
        System.out.println("Provinsi : "+ provTujuan[i]);
        System.out.println("No.Telp Penerima : " + noPenerima[i]);
        System.out.println("Jenis Barang: " + jenisBarang[i]);
        System.out.println("Berat Barang : " + berat[i]);
        System.out.println("Jenis Pengemasan : " + kondisi);
        System.out.println("Total Yang Harus Di Bayar : " + totalPembayaran);
        System.out.println("=================================================");
        
        System.out.println("Status Pengiriman (Y/T) :");
        status = sc.nextLine();
        if(status.equalsIgnoreCase("T")){
            System.out.println("Barang Sedang Dalam Proses Pengiriman");
        }else{
            System.out.println("Barang Sudah Sampai Kepada Penerima");
        }
        System.out.println("==========================================================================================");
               
    } 
        
        Ratings();
        System.out.println();
        System.out.println("Berikan Penilaian dari Ekspedisi ini " );
        System.out.println("Masukkan Komentar Dan Saran : ");
        feedback = sc.nextLine();
        System.out.println("=============== Ekspedisi Pengiriman Barang Anda Berhasil di Lakukan ====================");
    }
    }