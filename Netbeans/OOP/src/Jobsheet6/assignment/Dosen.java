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
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.TARIF_SKS = 50000;
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    protected int getGaji() {
        return jumlahSKS*TARIF_SKS; 
    }   
}
