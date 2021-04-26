/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aikacchii
 */
public class Peminjaman {

    private int idpeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    private String tanggalpinjam;
    private String tanggalkembali;

    public Peminjaman() {
    }

    public Peminjaman(Anggota anggota, Buku buku, String tanggalpinjam, String tanggalkembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public Peminjaman getById(int id) {
        Peminjaman kat = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT"
                + " p.idpeminjaman AS idpeminjaman,"
                + " b.idbuku AS idbuku,"
                + " b.judul AS judul,"
                + " b.penerbit AS penerbit,"
                + " b.penulis AS penulis,"
                + " k.idkategori AS idkategori,"
                + " k.nama AS kategori,"
                + " k.keterangan AS keterangan,"
                + " a.idanggota AS idanggota,"
                + " a.nama AS nama,"
                + " a.alamat AS alamat,"
                + " a.telepon AS telepon,"
                + " p.tanggalpinjam AS tanggalpinjam,"
                + " p.tanggalkembali AS tanggalkembali"
                + " FROM peminjaman p "
                + " INNER JOIN buku b"
                + " ON p.idbuku = b.idbuku"
                + " INNER JOIN anggota a"
                + " ON p.idanggota = a.idanggota"
                + " INNER JOIN kategori k"
                + " ON k.idkategori = b.idkategori"
                + " WHERE p.idpeminjaman = " + id);

        try {
            while (rs.next()) {
                kat = new Peminjaman();
                kat.setIdpeminjaman(rs.getInt("idpeminjaman"));
                kat.getAnggota().setIdanggota(rs.getInt("idanggota"));
                kat.getAnggota().setNama(rs.getString("nama"));
                kat.getAnggota().setAlamat(rs.getString("alamat"));
                kat.getAnggota().setTelepon(rs.getString("telepon"));
                kat.getBuku().setIdbuku(rs.getInt("idbuku"));
                kat.getBuku().setJudul(rs.getString("judul"));
                kat.getBuku().setPenerbit(rs.getString("penerbit"));
                kat.getBuku().setPenulis(rs.getString("penulis"));
                kat.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                kat.getBuku().getKategori().setNama(rs.getString("kategori"));
                kat.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                kat.setTanggalpinjam(rs.getString("tanggalpinjam"));
                kat.setTanggalkembali(rs.getString("tanggalkembali"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kat;
    }

    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT"
                + " p.idpeminjaman AS idpeminjaman,"
                + " b.idbuku AS idbuku,"
                + " b.judul AS judul,"
                + " b.penerbit AS penerbit,"
                + " b.penulis AS penulis,"
                + " k.idkategori AS idkategori,"
                + " k.nama AS kategori,"
                + " k.keterangan AS keterangan,"
                + " a.idanggota AS idanggota,"
                + " a.nama AS nama,"
                + " a.alamat AS alamat,"
                + " a.telepon AS telepon,"
                + " p.tanggalpinjam AS tanggalpinjam,"
                + " p.tanggalkembali AS tanggalkembali"
                + " FROM peminjaman p "
                + " INNER JOIN buku b"
                + " ON p.idbuku = b.idbuku"
                + " INNER JOIN anggota a"
                + " ON p.idanggota = a.idanggota"
                + " INNER JOIN kategori k"
                + " ON k.idkategori = b.idkategori");

        try {
            while (rs.next()) {
                Peminjaman kat = new Peminjaman();
                kat.setIdpeminjaman(rs.getInt("idpeminjaman"));
                kat.getAnggota().setIdanggota(rs.getInt("idanggota"));
                kat.getAnggota().setNama(rs.getString("nama"));
                kat.getAnggota().setAlamat(rs.getString("alamat"));
                kat.getAnggota().setTelepon(rs.getString("telepon"));
                kat.getBuku().setIdbuku(rs.getInt("idbuku"));
                kat.getBuku().setJudul(rs.getString("judul"));
                kat.getBuku().setPenerbit(rs.getString("penerbit"));
                kat.getBuku().setPenulis(rs.getString("penulis"));
                kat.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                kat.getBuku().getKategori().setNama(rs.getString("kategori"));
                kat.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                kat.setTanggalpinjam(rs.getString("tanggalpinjam"));
                kat.setTanggalkembali(rs.getString("tanggalkembali"));
                ListPeminjaman.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }

    public ArrayList<Peminjaman> searchAnggota(String keyword) {
        ArrayList<Peminjaman> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT"
                + " p.idpeminjaman AS idpeminjaman,"
                + " b.idbuku AS idbuku,"
                + " b.judul AS judul,"
                + " b.penerbit AS penerbit,"
                + " b.penulis AS penulis,"
                + " k.idkategori AS idkategori,"
                + " k.nama AS kategori,"
                + " k.keterangan AS keterangan,"
                + " a.idanggota AS idanggota,"
                + " a.nama AS nama,"
                + " a.alamat AS alamat,"
                + " a.telepon AS telepon,"
                + " p.tanggalpinjam AS tanggalpinjam,"
                + " p.tanggalkembali AS tanggalkembali"
                + " FROM peminjaman p "
                + " INNER JOIN buku b"
                + " ON p.idbuku = b.idbuku"
                + " INNER JOIN anggota a"
                + " ON p.idanggota = a.idanggota"
                + " INNER JOIN kategori k"
                + " ON k.idkategori = b.idkategori"
                + " WHERE a.idanggota = " + keyword 
                + " OR a.nama LIKE '%" +keyword+ "%'");

        try {
            while (rs.next()) {
                Peminjaman kat = new Peminjaman();
                kat.setIdpeminjaman(rs.getInt("idpeminjaman"));
                kat.getAnggota().setIdanggota(rs.getInt("idanggota"));
                kat.getAnggota().setNama(rs.getString("nama"));
                kat.getAnggota().setAlamat(rs.getString("alamat"));
                kat.getAnggota().setTelepon(rs.getString("telepon"));
                kat.getBuku().setIdbuku(rs.getInt("idbuku"));
                kat.getBuku().setJudul(rs.getString("judul"));
                kat.getBuku().setPenerbit(rs.getString("penerbit"));
                kat.getBuku().setPenulis(rs.getString("penulis"));
                kat.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                kat.getBuku().getKategori().setNama(rs.getString("kategori"));
                kat.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                kat.setTanggalpinjam(rs.getString("tanggalpinjam"));
                kat.setTanggalkembali(rs.getString("tanggalkembali"));
                ListAnggota.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public ArrayList<Peminjaman> searchBuku(String keyword) {
         ArrayList<Peminjaman> ListBuku = new ArrayList();
         ResultSet rs = DBHelper.selectQuery("SELECT"
                + " p.idpeminjaman AS idpeminjaman,"
                + " b.idbuku AS idbuku,"
                + " b.judul AS judul,"
                + " b.penerbit AS penerbit,"
                + " b.penulis AS penulis,"
                + " k.idkategori AS idkategori,"
                + " k.nama AS kategori,"
                + " k.keterangan AS keterangan,"
                + " a.idanggota AS idanggota,"
                + " a.nama AS nama,"
                + " a.alamat AS alamat,"
                + " a.telepon AS telepon,"
                + " p.tanggalpinjam AS tanggalpinjam,"
                + " p.tanggalkembali AS tanggalkembali"
                + " FROM peminjaman p "
                + " INNER JOIN buku b"
                + " ON p.idbuku = b.idbuku"
                + " INNER JOIN anggota a"
                + " ON p.idanggota = a.idanggota"
                + " INNER JOIN kategori k"
                + " ON k.idkategori = b.idkategori"
                + " WHERE b.idbuku = " + keyword
                + " OR b.judul LIKE '%" +keyword+ "%'");

        try {
            while (rs.next()) {
                Peminjaman kat = new Peminjaman();
                kat.setIdpeminjaman(rs.getInt("idpeminjaman"));
                kat.getAnggota().setIdanggota(rs.getInt("idanggota"));
                kat.getAnggota().setNama(rs.getString("nama"));
                kat.getAnggota().setAlamat(rs.getString("alamat"));
                kat.getAnggota().setTelepon(rs.getString("telepon"));
                kat.getBuku().setIdbuku(rs.getInt("idbuku"));
                kat.getBuku().setJudul(rs.getString("judul"));
                kat.getBuku().setPenerbit(rs.getString("penerbit"));
                kat.getBuku().setPenulis(rs.getString("penulis"));
                kat.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                kat.getBuku().getKategori().setNama(rs.getString("kategori"));
                kat.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                kat.setTanggalpinjam(rs.getString("tanggalpinjam"));
                kat.setTanggalkembali(rs.getString("tanggalkembali"));
                ListBuku.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void save() {
        if (getById(idpeminjaman).getIdpeminjaman() == 0) {
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalkembali, tanggalpinjam) VALUES("
                    + " '" + this.getAnggota().getIdanggota() + "',"
                    + " '" + this.getBuku().getIdbuku() + "',"
                    + " '" + this.tanggalpinjam + "',"
                    + " '" + this.tanggalkembali + "')";
            this.idpeminjaman = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "UPDATE peminjaman SET"
                    + " idanggota = '" + this.getAnggota().getIdanggota()+ "',"
                    + " idbuku = '" + this.getBuku().getIdbuku()+ "',"
                    + " tanggalpinjam = '" + this.tanggalpinjam + "',"
                    + " tanggalkembali = '" + this.tanggalkembali + "'"
                    + " WHERE idpeminjaman = '" + this.idpeminjaman + "'";
            DBHelper.executeQuery(sql);
        }
    }

    public void delete() {
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper.executeQuery(sql);
    }
}
