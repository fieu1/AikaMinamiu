/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PunyaAlwi;

/**
 *
 * @author MeiMei
 */
public class minMax {

    public int valueArray;
    public int minimal;
    public int maximal;
    public void bruteForce(int[] arr) {
        minimal = arr[0];
        maximal = arr[0];
        for (int i = 0; i < 5; i++) {
            if (arr[i] < minimal) {
                minimal = arr[i];
            } else if (arr[i] > maximal) {
                maximal = arr[i];
            }
        }
    }
}
