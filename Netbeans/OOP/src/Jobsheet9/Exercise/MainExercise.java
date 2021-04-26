/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet9.Exercise;

/**
 *
 * @author Aikacchii
 */
public class MainExercise {
    public static void main(String[] args) {
        Mac mac = new Mac("Avast", "Li-on", "Macbook Air", "Intel", 4280, 526);
        mac.tampilMac();
        
        Windows w = new Windows("Windows 10", "Li-on", "Asus", "AMD Ryzen 5", 4096, 526);
        w.tampilWindows();
        
        Pc p = new Pc(14, "Samsung", "Intel i9", 8128, 1024);
        p.tampilPc();
    }
}
