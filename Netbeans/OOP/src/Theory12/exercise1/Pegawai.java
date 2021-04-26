/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory12.exercise1;

/**
 *
 * @author Aikacchii
 */
public class Pegawai {
    protected String nama;
    protected int gaji;

    public Pegawai() {
    }

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int getGaji(){
        return gaji;
    }
}
