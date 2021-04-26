
import java.util.Scanner;
public class FinalProject1 {
    static int kategoriTujuan(){
        Scanner sc = new Scanner (System.in);
        String kategori, layanan;
        int ongkir = 0;
        System.out.println("====== KATEGORI PENGIRIMAN ======");
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
    
    // disini kamu gaperlu pake parameter juga gapapa kok
    static int Ratings(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Ratings 1-5 : ");
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            System.out.print("*");
        }
        return a;
    }
    public static void main(String[] args) {
        String namaPengirim, alamatPengirim, namaPenerima, alamatPenerima, kec, kot, prov;
        String noPengirim, noPenerima,jenisBarang, kemas, feedback, status;
        int berat;
        Scanner sc = new Scanner(System.in);
        Scanner sci = new Scanner(System.in); //ini dipake buat input nextInt
        //jadi kalo misal mau bikin inputan yang ada  nextLine ato next sama nextInt ato nextDouble
        //itu buat Scanner kepisah antara nextLine, next sama nextInt nextDouble biar ngga ngebug programnya
        System.out.println("===========EKSPEDISI PENGIRIMAN BARANG==========");
        System.out.print("Nama Pengirim :");
        namaPengirim = sc.nextLine();
        System.out.print("Alamat Pengirim :");
        alamatPengirim = sc.nextLine();
        System.out.print("No.Telp Pengirim :");
        noPengirim = sc.nextLine();
        System.out.print("Nama Penerima :");
        namaPenerima = sc.nextLine();
        System.out.print("Alamat Penerima :");
        alamatPenerima = sc.nextLine();
        System.out.print("No.Telp Penerima:");
        noPenerima = sc.nextLine();
        System.out.println("========= ASAL TUJUAN =======");
        System.out.print("Kecamatan :");
        kec = sc.nextLine();
        System.out.print("Kota :");
        kot = sc.nextLine();
        System.out.print("Provinsi :");
        prov = sc.nextLine();
        
        //pake system.out.println ya wkwkwk
        System.out.println("\n=============================================================");
        System.out.println("==========Kategori Jenis Barang========");
        System.out.println("1) Jenis Elektronik(Cont: Televisi, dll");
        System.out.println("2) Jenis Farmasi(Cont: Obat-obatan, dll");
        System.out.println("3) Jenis Apparel(Cont: Pakaian, dll)");
        System.out.println("4) Jenis Food and Beverage(Cont: Makanan, dll");
        System.out.println("5) Jenis Kosmetik(Cont: Produk kecantikan, dll");
        System.out.println("6) Jenis Otomotif(Cont: Spare art, dll");
        System.out.print("Masukkan Kategori Jenis Barang : ");
        jenisBarang = sc.nextLine();
        System.out.println("=========Berat Barang========");
        //pake int aja ya sayang, yang biasanya paling umum pake int sekalipun bilangan kecil
        System.out.print("Masukkan Berat Barang (KG)");
        berat = sci.nextInt();
        System.out.println("=========Kategori Jenis Pengemasan========");
        System.out.println("a) Pengemasan Plastik");
        System.out.println("b) Pengemasan Buble Warp");
        System.out.println("c) Pengemasan Kardus");
        System.out.println("d) Pengemasan Karung");
        System.out.println("e) Pengemasan Kayu");
        System.out.println("f) Pengemasan Box Pendingin");
        System.out.print("Masukkan Jenis Pengemasan (Masukkan huruf pilihan):"); 
        //dikasih tau hurufnya saja biar usernya tau harus masukin gimana
        kemas = sc.nextLine();
        int beratTotal = 0;
        double ppn = 0, biayaTotal = 0;
        
        //dikasih do while biar kalo nanti usernya salah input bisa input ulang
        boolean ulang = false;
        
        do{
        switch(kemas){
            case ("a"):
                beratTotal = berat*10000;
                ppn = beratTotal*10/100;
                biayaTotal = beratTotal + ppn;
            break;
            case ("b"):
                beratTotal = berat*20000;
                ppn = beratTotal*10/100;
                biayaTotal = beratTotal + ppn;
            break;
            case ("c"):
                beratTotal = berat*15000;
                ppn = beratTotal*10/100;
                biayaTotal = beratTotal + ppn;
            break;
            case ("d"):
                beratTotal = berat*17000;
                ppn = beratTotal*10/100;
                biayaTotal = beratTotal + ppn;
            break;
            case ("e"):
                beratTotal = berat*30000;
                ppn = beratTotal*10/100;
                biayaTotal = beratTotal + ppn;
            break;
            case ("f"):
                beratTotal = berat*25000;
                ppn = beratTotal*10/100;
                biayaTotal = beratTotal + ppn;
            break;
            default:
                System.out.println("Kategori yang anda masukkan tidak sesuai");
                //kalo true nanti bakal looping
                ulang = true;
            break;
        }
        }while(ulang);
        //kategori tujuannya disimpen dulu di variabel
        int ongkir = kategoriTujuan();
        System.out.println("=====Cetak Resi===========");
        System.out.println("Total Biaya Kg : Rp."+beratTotal+",-");
        System.out.println("Biaya PPN 10% : Rp."+ppn+",-");
        System.out.println("Biaya Total Pengemasan : Rp."+biayaTotal+",-");        
        System.out.println("Biaya Ongkir : Rp."+ongkir+",-");
        //buat variabel yang menampung total pembayaran
        int totalPembayaran = (int) (biayaTotal + ongkir); //(int) fungsinya buat mengubah double ke integer
        System.out.println("Total Pembayaran :"+ totalPembayaran);
        System.out.println("===========Kategori Pembayaran==============");
        String bayarVia;
        System.out.println("a) Via Link aja");
        System.out.println("b) Via Transfer ATM");
        System.out.println("c) Via Internet Banking");
        System.out.println("d) Via Minimarket");
        System.out.println("e) Via Wallet");
        System.out.println("Masukkan Kategori Pembayaran :");
        bayarVia = sc.nextLine();
        if(bayarVia.equalsIgnoreCase("a")){
            System.out.println("Pembayaran Via Link aja");
        }else if(bayarVia.equalsIgnoreCase("b")){
            System.out.println("Pembayaran Via Transfer ATM");
        }else if(bayarVia.equalsIgnoreCase("c")){
            System.out.println("Pembayaran Via Internet Banking");
        }else if(bayarVia.equalsIgnoreCase("d")){
            int biayaAdmin = 2000; //gapake kayak gini juga gapapa sih
            System.out.println("Pembayaran Via Minimarket Dengan Biaya admin 2000");
            totalPembayaran+=biayaAdmin;
            System.out.println("Silahkan membayar sejumlah " + totalPembayaran); 
        }else if(bayarVia.equalsIgnoreCase("e")){
            System.out.println("Pembayaran Via Wallet");
        }else{
            System.out.println("Kategori Pembayaran yang anda masukkan tidak sesuai");
        }
        System.out.println("Status Pengiriman (Y/T) :");
        status = sc.nextLine();
        if(status.equalsIgnoreCase("T")){
            System.out.println("Barang Sedang Dalam Proses Pengiriman");
        }else{
            System.out.println("Barang Sudah Sampai Kepada Penerima");
        }
        System.out.println("Berikan Penilaian dari Ekspedisi ini " + Ratings());
        System.out.println();
        System.out.println("Masukkan Komentar Dan Saran : ");
        feedback = sc.nextLine();
        System.out.println("=============Ekspedisi Pengiriman Barang Anda Berhasil di Lakukan====================");
    }
    }