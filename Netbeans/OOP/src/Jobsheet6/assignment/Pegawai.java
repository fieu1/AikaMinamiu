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
public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;

    protected Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    protected String getNama() {
        return nama;
    }
    
    protected int getGaji(){
        return 0;
    }
}
