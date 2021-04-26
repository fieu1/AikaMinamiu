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
public class Manager extends Employee{
    private double tunjangan;
    private String bagian;
    private Staff st[];

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    public void setStaff(Staff st[]) {
        this.st = st;
    }
    
    public void viewStaff(){
        int i;
        System.out.println("--------------------------");
        for(i=0;i<st.length;i++){
            st[i].lihatInfo();
        }
        System.out.println("--------------------------");
    }
    
    public void lihatInfo(){
        System.out.println("Manager : " + this.getBagian());
        System.out.println("NIP : " + this.getNip());
        System.out.println("Nama : " + this.getNama());
        System.out.println("Golongan : " + this.getGolongan());
        System.out.printf("Tunjangan : %.0f\n",this.getTunjangan());
        System.out.printf("Gaji : %.0f\n" , this.getGaji());
        System.out.println("Bagian : " + this.getBagian());
        this.viewStaff();
    }

    public double getGaji() {
        return super.getGaji()+tunjangan; 
    }
}
