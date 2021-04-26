package backend;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Aikacchii
 */
public class Anggota {

    private int idanggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota() {
    }

    public Anggota(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public int getIdanggota() {
        return idanggota;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Anggota getById(int id) {
        Anggota kat = new Anggota();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Anggota();
                kat.setIdanggota(rs.getInt("idanggota"));
                kat.setNama(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kat;
    }

    public ArrayList<Anggota> getAll() {
        ArrayList<Anggota> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota kat = new Anggota();
                kat.setIdanggota(rs.getInt("idanggota"));
                kat.setNama(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelepon(rs.getString("telepon"));

                ListAnggota.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota> search(String keyword) {
        ArrayList<Anggota> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE "
                + "nama LIKE '%" + keyword + "%' "
                + "OR alamat LIKE '%" + keyword + "%'"
                + "OR telepon LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Anggota kat = new Anggota();
                kat.setIdanggota(rs.getInt("idanggota"));
                kat.setNama(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelepon(rs.getString("telepon"));

                ListAnggota.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public void save() {
        if (getById(idanggota).getIdanggota() == 0) {
            String sql = "INSERT INTO anggota (nama, alamat, telepon) VALUES ("
                    + " '" + this.nama + "',"
                    + " '" + this.alamat + "',"
                    + " '" + this.telepon
                    + "')";
            this.idanggota = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "UPDATE anggota SET"
                    + " nama = '" + this.nama + "',"
                    + " alamat = '" + this.alamat + "',"
                    + " telepon = '" + this.telepon + "'"
                    + " WHERE idanggota = '" + this.idanggota + "'";
            DBHelper.executeQuery(sql);
        }
    }

    public void delete() {
        String sql = "DELETE FROM anggota WHERE idanggota = '" + this.idanggota + "'";
        DBHelper.executeQuery(sql);
    }
}
