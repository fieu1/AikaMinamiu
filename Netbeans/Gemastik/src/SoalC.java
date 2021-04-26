/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Aikacchii
 */
public class SoalC {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int a[] = new int[in], b[] = new int[in], c[] = new int[in];
        for (int i = 0; i < in; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        for (int j = 0; j < in; j++) {
            for (int i = 0; i < c[j]; i++) {
                if(a[j] > b[j]){
                    if (a[j]%2!=0) {
                        a[j]-=1;
                    }
                    a[j]/=2;
                }else{
                    if(b[j]%2!=0){
                        b[j]-=1;
                    }
                    b[j]/=2;
                }
            }
            if(a[j] > b[j] || a[j] == b[j]){
                System.out.println(a[j] + " " + b[j]);
            }else{
                System.out.println(b[j] + " " + a[j]);
            }
        }

    }

}
