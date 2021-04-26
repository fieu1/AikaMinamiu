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
public class ProgramJ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        int[] x = new int[amount];
        int[] y = new int[amount];
        int keluaran =0;
        for (int i = 0; i < amount; i++) {
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();
            
            x[i]=a2-a1;
            y[i]=b2-b1;
        }
        
        for(int j = 0; j<amount;j++){
            for(int k=1;k==amount;k++){
                if(k==amount){
                    k=0;
                }
                
                if(x[j]> x[k] || y[j]>y[k]){
                    if(x[j]>y[k] || y[j]>x[k]){
                       keluaran++; 
                    }
                }
                
                if(k==0){
                    break;
                }
            }
        }
        System.out.println(keluaran);
    }
}
