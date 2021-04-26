/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7;

/**
 *
 * @author MeiMei
 */
public class Assign3 {

    public int[] bubbleSort(int[] data) { //method for sorting data
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j] < data[j - 1]) {
                    int tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
        return data; //return value
    }

    public int FindAmountBinarySearch(int[] temp, int search, int left, int right, int amnt) { //method for searching amount of maximum value
        int mid; 
        if (right >= left) { //if last index is bigger than first index
            mid = (right + left) / 2; //middle index
            if (search == temp[mid]) { //if array value is same with search number
                amnt++; //amount increases
                return FindAmountBinarySearch(temp, search, mid + 1, right, amnt); //recursive for check another index
            }else if (temp[mid] > search) { //if array value bigger than search number
                return FindAmountBinarySearch(temp, search, left, mid - 1 , amnt); //recursive
            } else { 
                return FindAmountBinarySearch(temp, search, mid + 1, right, amnt); //recursice
            }
        } 
        if(right == left){ //base line
            if(search == temp[left]){ //if array value is same with search number
                amnt++; //amount increase
                return amnt; //return value
            }
        }
        return amnt; //return value
    }
    
    public int[] FindIndexBinarySearch(int[] temp, int search, int left, int right, int[] idx, int indx) { //method for looking the index of maximum value
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (search == temp[mid]) {
                idx[indx] = mid; //saving index of max. value in array
                indx++; //index of array increased
                return FindIndexBinarySearch(temp, search, mid + 1, right, idx , indx);
            }else if (temp[mid] > search) {
                return FindIndexBinarySearch(temp, search, left, mid - 1, idx, indx);
            } else {
                return FindIndexBinarySearch(temp, search, mid + 1, right, idx, indx);
            }
        } 
        if(right == left){ //base line
            if(search == temp[left]){
                idx[indx] = left; //save index to array
                return idx; //return array
            }
        }
        return idx; //return array
    }
}
