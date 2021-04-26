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
public class MainDosen {
    public static void main(String[] args) {
        Dosen ds = new Dosen("3712047", "Aika", "Malang");
        Dosen ds1 = new Dosen("374112847", "Ai", "Malang");
        Dosen ds2 = new Dosen("371312047", "Ka", "Malang");
        ds.setSKS(45);
        ds1.setSKS(30);
        ds2.setSKS(27);
        DaftarGaji dg = new DaftarGaji(3);
        dg.addPegawai(ds);
        dg.addPegawai(ds1);
        dg.addPegawai(ds2);
        dg.printSemuaGaji();
    }
}
