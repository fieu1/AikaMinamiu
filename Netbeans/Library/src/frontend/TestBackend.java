package frontend;

import backend.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Aikacchii
 */
public class TestBackend {

    public static void main(String[] args) throws ParseException {
        Buku novel = new Buku().getById(21);
        Buku reference = new Buku().getById(22);
        Anggota aika = new Anggota().getById(32);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date11= df.parse("2001-11-06");
        java.sql.Date date1 = new java.sql.Date(date11.getDate());
        Date date12= df.parse("2002-05-06");
        java.sql.Date date2 = new java.sql.Date(date12.getDate());
        Peminjaman buku1 = new Peminjaman(aika, novel, date1, date2);
        Peminjaman buku2 = new Peminjaman(aika, reference, date1, date2);
      
// test insert
        buku1.save();
        buku2.save();
// test update
        Date date13= df.parse("2001-12-06");
        java.sql.Date date3 = new java.sql.Date(date13.getDate());
        buku1.setTanggalkembali(date3);
        buku1.save();
// test delete
        buku2.delete();
// test select all
        for (Peminjaman b : new Peminjaman().getAll()) {
            System.out.println("Anggota: " + b.getAnggota().getNama() + ", Judul: " + b.getBuku().getJudul() + ", Tanggal Pinjam: " + b.getTanggalpinjam() + ", Tanggal Kembali: " + b.getTanggalkembali());
        }
// test search
//        for (Peminjaman b : new Peminjaman().searchAnggota("Meu")) {
//            System.out.println("Anggota: " + b.getAnggota().getNama() + ", Judul: " + b.getBuku().getJudul() + ", Tanggal Pinjam: " + b.getTanggalpinjam() + ", Tanggal Kembali: " + b.getTanggalkembali());
//        }
    }
}
