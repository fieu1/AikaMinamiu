/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet10.Experiment1;

/**
 *
 * @author Aikacchii
 */
public class Staff extends Employee{
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double gajilembur) {
        this.gajiLembur = gajilembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur; //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getGaji() {
        return super.getGaji() + lembur * gajiLembur; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void lihatInfo(){
        System.out.println("NIP : " + this.getNip());
        System.out.println("Nama : " + this.getNama());
        System.out.println("Golongan : " + this.getGolongan());
        System.out.println("Jml Lembur : " + this.getLembur());
        System.out.printf("Gaji Lembur : %.0f\n" , this.getGajiLembur());
        System.out.printf("Gaji : %.0f\n" , this.getGaji());
    }
}
