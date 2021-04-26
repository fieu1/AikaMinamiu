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
public class detNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input jumlah angka : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        int even = 0, odd = 0, prime = 0;

        System.out.println("Input angka :");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                even++;
            } else if (arr[i] % 2 == 1) {
                odd++;
            }

            int m = 0, checker = 0;
            m = arr[i] / 2;
            if (arr[i] == 0 || arr[i] == 1) {
                prime++;
            } else {
                for (int k = 2; k <= m; k++) {
                    if (arr[i] % k == 0) {
                        checker = 1;
                        break;
                    }
                }   
                if (checker == 0) {
                    prime++;
                }
            }
        }
        System.out.print("Angka yang diinputkan : ");
        for(int l = 0; l < len; l++){
            System.out.print(arr[l]);
        }
        System.out.println("");
        System.out.println("Jumlah bilangan genap:" + even);
        System.out.println("Jumlah bilangan ganjil:" + odd);
        System.out.println("Jumlah bilangan prima:" + prime);
    }
}
