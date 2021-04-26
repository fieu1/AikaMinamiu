/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6.assignment;

/**
 *
 * @author Aikacchii
 */
public class DaftarGaji {

    public Pegawai[] listPegawai;

    public DaftarGaji(int jumlahPegawai) {
        this.listPegawai = new Pegawai[jumlahPegawai];
    }

    public void addPegawai(Pegawai p) {
        int amt = 0;
        while (listPegawai[amt] != null && amt < listPegawai.length) {
            amt++;
        }
        listPegawai[amt] = p;
    }

    public void printSemuaGaji() {
        for (int i = 0; i < listPegawai.length; i++) {
            System.out.println("===========================================");
            System.out.println("Nama : " + listPegawai[i].nama);
            System.out.println("Gaji : " + listPegawai[i].getGaji());
            System.out.println("===========================================");
        }
    }
}
