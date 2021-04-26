/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

/**
 *
 * @author Aikacchii
 */
public class PersegiPanjang extends BangunDatar {
    public float panjang;
    public float lebar;

    
    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float Luas() {
        return panjang*lebar; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float Keliling() {
        return 2*panjang*lebar; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
