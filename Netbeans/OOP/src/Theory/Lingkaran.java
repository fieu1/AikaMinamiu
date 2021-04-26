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
public class Lingkaran extends BangunDatar{
    public float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    public float Luas() {
        return r*r*3.14f; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float Keliling() {
        return 2*r*3.14f; //To change body of generated methods, choose Tools | Templates.
    }
}
