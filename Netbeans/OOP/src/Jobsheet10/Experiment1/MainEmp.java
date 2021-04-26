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
public class MainEmp {
    public static void main(String[] args) {
        System.out.println("Testing Program Manager & Staff Class");
        Manager man[]= new Manager[2];
        Staff staff1[]= new Staff[2];
        Staff staff2[]= new Staff[3];
        
        man[0] = new Manager();
        man[0].setNama("Aika");
        man[0].setNip("124");
        man[0].setGolongan("1");
        man[0].setTunjangan(5000000);
        man[0].setBagian("Administrasi");
        
        man[1] = new Manager();
        man[1].setNama("Meuti");
        man[1].setNip("109");
        man[1].setGolongan("1");
        man[1].setTunjangan(2500000);
        man[1].setBagian("Marketing");
        
        staff1[0] = new Staff();
        staff1[0].setNama("Akio");
        staff1[0].setNip("310");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(15000);
 
        staff1[1] = new Staff();
        staff1[1].setNama("Ai");
        staff1[1].setNip("311");
        staff1[1].setGolongan("3");
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(10000);
        man[0].setStaff(staff1);
        
        staff2[0] = new Staff();
        staff2[0].setNama("Laksda");
        staff2[0].setNip("313");
        staff2[0].setGolongan("4");
        staff2[0].setLembur(15);
        staff2[0].setGajiLembur(5500);
 
        staff2[1] = new Staff();
        staff2[1].setNama("Rayy");
        staff2[1].setNip("314");
        staff2[1].setGolongan("4");
        staff2[1].setLembur(5);
        staff2[1].setGajiLembur(100000);
       
        staff2[2] = new Staff();
        staff2[2].setNama("Mery");
        staff2[2].setNip("315");
        staff2[2].setGolongan("4");
        staff2[2].setLembur(6);
        staff2[2].setGajiLembur(150000);
       
        man[1].setStaff(staff2);
        
        man[0].lihatInfo();
        man[1].lihatInfo();
        
    }
}
