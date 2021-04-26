/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4;
/**
 *
 * @author Aikacchii
 */
public class Anggota {
    private String nama;
    private int IDNumber;
    private int borrowing_limit;
    private int loanAmount;

    public Anggota(int IDNumber,String nama,  int borrowing_limit) {
        this.nama = nama;
        this.IDNumber = IDNumber;
        this.borrowing_limit = borrowing_limit;
        this.loanAmount = 0;
    }
 
    public String getNama(){
        return nama;
    }
    public float getLimitPinjaman(){
        return borrowing_limit;
    }
    public float getJumlahPinjaman(){
        return loanAmount;
    }
    public void angsur(float money){
        if(money >= (loanAmount*0.1)){
            loanAmount-= money;
        } else {
            System.out.println("Sorry, installment must be 10% of the loan amount");
        }
        
    }
    public void pinjam(float money){
        if(borrowing_limit>=money && loanAmount <= borrowing_limit ){
            loanAmount+=money;
        } else {
            System.out.println("Sorry, total amount reached limit");
        }
    }
}
