    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package backend;
    import java.sql.*;
    import java.util.ArrayList;
    /**
     *
     * @author Aikacchii
     */
    public class Buku {
        private int idbuku;
        private Kategori kategori = new Kategori();
        private String judul;
        private String penerbit;
        private String penulis;

        public Buku() {
        }

        public Buku(Kategori kategori, String judul, String penerbit, String penulis) {
            this.kategori = kategori;
            this.judul = judul;
            this.penerbit = penerbit;
            this.penulis = penulis;

       }

        public int getIdbuku() {
            return idbuku;
        }

        public Kategori getKategori() {
            return kategori;
        }

        public String getJudul() {
            return judul;
        }

        public String getPenerbit() {
            return penerbit;
        }

        public String getPenulis() {
            return penulis;
        }

        public void setIdbuku(int idbuku) {
            this.idbuku = idbuku;
        }

        public void setKategori(Kategori kategori) {
            this.kategori = kategori;
        }

        public void setJudul(String judul) {
            this.judul = judul;
        }

        public void setPenerbit(String penerbit) {
            this.penerbit = penerbit;
        }

        public void setPenulis(String penulis) {
            this.penulis = penulis;
        }

        public Buku getById(int id) {
            Buku kat = new Buku();
            ResultSet rs = DBHelper.selectQuery("SELECT"
                    + " b.idbuku AS idbuku,"
                    + " b.judul AS judul,"
                    + " b.penerbit AS penerbit,"
                    + " b.penulis AS penulis,"
                    + " k.idkategori AS idkategori,"
                    + " k.nama AS nama,"
                    + " k.keterangan AS keterangan"
                    + " FROM buku b"
                    + " LEFT JOIN kategori k"
                    + " ON b.idkategori = k.idkategori"
                    + " WHERE b.idbuku = '" + id + "'");

            try {
                while (rs.next()) {
                    kat = new Buku();
                    kat.setIdbuku(rs.getInt("idbuku"));
                    kat.getKategori().setIdkategori(rs.getInt("idkategori"));
                    kat.getKategori().setNama(rs.getString("nama"));
                    kat.getKategori().setKeterangan(rs.getString("keterangan"));
                    kat.setJudul(rs.getString("judul"));
                    kat.setPenerbit(rs.getString("penerbit"));
                    kat.setPenulis(rs.getString("penulis"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            return kat;
        }

        public ArrayList<Buku> getAll() {
            ArrayList<Buku> ListBuku = new ArrayList();

            ResultSet rs = DBHelper.selectQuery("SELECT b.idbuku AS idbuku,"
                    + " b.judul AS judul,"
                    + " b.penerbit AS penerbit,"
                    + " b.penulis AS penulis,"
                    + " k.idkategori AS idkategori,"
                    + " k.nama AS nama,"
                    + " k.keterangan AS keterangan"
                    + " FROM buku b"
                    + " LEFT JOIN kategori k"
                    + " ON b.idkategori = k.idkategori");

            try {
                while (rs.next()) {
                    Buku kat = new Buku();
                    kat.setIdbuku(rs.getInt("idbuku"));
                    kat.getKategori().setIdkategori(rs.getInt("idkategori"));
                    kat.getKategori().setNama(rs.getString("nama"));
                    kat.getKategori().setKeterangan(rs.getString("keterangan"));
                    kat.setJudul(rs.getString("judul"));
                    kat.setPenerbit(rs.getString("penerbit"));
                    kat.setPenulis(rs.getString("penulis"));

                    ListBuku.add(kat);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ListBuku;
        }

        public ArrayList<Buku> search(String keyword) {
            ArrayList<Buku> ListBuku = new ArrayList();

            ResultSet rs = DBHelper.selectQuery("SELECT b.idbuku AS idbuku,"
                    + " b.judul AS judul,"
                    + " b.penerbit AS penerbit,"
                    + " b.penulis AS penulis,"
                    + " k.idkategori AS idkategori,"
                    + " k.nama AS nama,"
                    + " k.keterangan AS keterangan"
                    + " FROM buku b"
                    + " LEFT JOIN kategori k"
                    + " ON b.idkategori = k.idkategori"
                    + " WHERE b.judul LIKE '%" + keyword + "%' "
                    + " OR b.penulis LIKE '%" + keyword + "%' "
                    + " OR b.penerbit LIKE '%" + keyword + "%' ");

            try {
                while (rs.next()) {
                    Buku kat = new Buku();
                    kat.setIdbuku(rs.getInt("idbuku"));
                    kat.getKategori().setIdkategori(rs.getInt("idkategori"));
                    kat.getKategori().setNama(rs.getString("nama"));
                    kat.getKategori().setKeterangan(rs.getString("keterangan"));
                    kat.setJudul(rs.getString("judul"));
                    kat.setPenerbit(rs.getString("penerbit"));
                    kat.setPenulis(rs.getString("penulis"));

                    ListBuku.add(kat);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ListBuku;
        }

        public void save() {
            if (getById(idbuku).getIdbuku()== 0) {
                String sql = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                        + " '" + this.judul + "',"
                        + " '" + this.getKategori().getIdkategori() + "',"
                        + " '" + this.penulis + "',"
                        + " '" + this.penerbit + "')";
                this.idbuku = DBHelper.insertQueryGetId(sql);
            } else {
                String sql = "UPDATE buku SET"
                        + " judul = '" + this.judul + "',"
                        + " idkategori = '" + this.getKategori().getIdkategori() + "',"
                        + " penulis = '" + this.penulis + "',"
                        + " penerbit = '" + this.penerbit + "'"
                        + " WHERE idbuku = '" + this.idbuku + "'";
                DBHelper.executeQuery(sql);
            }
        }

        public void delete() {
            String sql = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
            DBHelper.executeQuery(sql);
        }
    }
