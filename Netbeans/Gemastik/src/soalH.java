/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Aikacchii
 */
public class soalH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        int[] res = new int[q];
        int idx = 0;
        for (int k = 0; k < q; k++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            
            for (int l = x1 - 1; l < x2; l++) {
                for (int p = y1 - 1; p < y2; p++) {
                    res[idx] = arr[l][p]+res[idx];
                }
            }
            idx++;
        }
        for(int i=0;i<q;i++){
            System.out.println(res[i]);
        }
    }

}
