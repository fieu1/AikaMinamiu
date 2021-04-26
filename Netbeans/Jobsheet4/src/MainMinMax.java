/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author MeiMei
 */
public class MainMinMax {
    public static void main(String[] args) {
        
        minMax[] ppArray = new minMax[5];
        ppArray[0] = new minMax();
        int min = ppArray[0].valueArray;
        int max = ppArray[0].valueArray;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<5;i++){
            ppArray[i] = new minMax();
            System.out.println("Index array value to-" + i);
            System.out.print("Input value : " );
            ppArray[i].valueArray = sc.nextInt();
        }
        
        for(int i=0;i<5;i++){
            arr[i] = ppArray[i].valueArray;
        }
        Result hasilBF = new Result();
        
        Result hasil = new Result();
        Result mM = new Result();
        mM.max_min(arr,0,4, hasil);
        
        System.out.println("Divide and Conquer");
        System.out.println(" Minimum value : " + hasil.minimum + "Maximum value : " + hasil.maximum );
    }
}
