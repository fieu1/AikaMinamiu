/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet10.Task.Overriding;

/**
 *
 * @author Aikacchii
 */
public class MainOverride {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Dosen ds = new Dosen();
        mhs.bernafas();
        mhs.makan();
        mhs.tidur();
        ds.bernafas();
        ds.makan();
        ds.lembur();
    }
}
