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
public class TestMahasiswa {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mahasiswa mhs2 = new mahasiswa();
        mahasiswa mhs3 = new mahasiswa();
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No. 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        mhs2.nim=102;
        mhs2.nama="Rian";
        mhs2.alamat="Jl. Simp Remujunh No. 1";
        mhs2.kelas = "1G";
        mhs2.tampilBiodata();
        mhs3.nim=130;
        mhs3.nama="Moen";
        mhs3.alamat="Jl. Asahan No. 7";
        mhs3.kelas = "1H";
        mhs3.tampilBiodata();
    }
}
