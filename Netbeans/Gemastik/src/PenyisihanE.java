/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Aikacchii
 */
public class PenyisihanE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double[] x = new double[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
        }
        double res = x[0];
        double powered = x[n-1];
        for(int i=n-2;i>0;i--){
            powered = (Math.pow(x[i], powered)); 
        }
        double rest = Math.pow(res, powered);
        double a = res % 100000037;
        System.out.println(a);
        System.out.println(powered);
        System.out.println(rest);
    }
}
