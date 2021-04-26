/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PunyaAlwi;

/**
 *
 * @author MeiMei
 */
public class sort4 {

    int[] nik;
    int pos = -1;
    String[] name;
    String[] address;
    String[] gender;

    public sort4(int[] ni, String[] na, String[] ad, String[] ge) {
        nik = ni;
        name = na;
        address = ad;
        gender = ge;
    }

    public void find(int search) {
        for (int i = 0; i < nik.length; i++) {
            if (nik[i] == search) {
                pos = i;
                break;
            }
        }
    }
    
    public void print(){
        if(pos==-1){
            System.out.println("NIK not found");
        }else{
            System.out.println("NIK "+nik[pos]+" found ");
            System.out.println("Nama    : "+name[pos]);
            System.out.println("Alamat  : "+address[pos]);
            System.out.println("Jenos Kelamin : "+gender[pos]);
        }
    }
}

