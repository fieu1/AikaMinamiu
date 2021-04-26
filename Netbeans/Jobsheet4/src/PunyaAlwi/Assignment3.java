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
public class Assignment3 {

    public void MergeSort(int[] data) {
        Sort(data, 0, data.length - 1);
    }

    public void merge(int data[], int left, int middle, int right) {
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }

        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }
    }

    public void Sort(int data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            Sort(data, left, middle);
            Sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printData(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int BSCount(int[] data, int search, int left, int right, int count) { //method for searching amount of maximum value
        int mid; 
        if (right >= left) { //if last index is bigger than first index
            mid = (right + left) / 2; //middle index
            if (search == data[mid]) { //if array value is same with search number
                count++; //amount increases
                return BSCount(data, search, mid + 1, right, count); //recursive for check another index
            }else if (data[mid] > search) { //if array value bigger than search number
                return BSCount(data, search, left, mid - 1 , count); //recursive
            } else { 
                return BSCount(data, search, mid + 1, right, count); //recursice
            }
        } 
        if(right == left){ //base line
            if(search == data[left]){ //if array value is same with search number
                count++; //amount increase
                return count; //return value
            }
        }
        return count; //return value
    }
    
    public int[] BSIndex(int[] data, int search, int left, int right, int[] arrIdx, int idx) { //method for looking the index of maximum value
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (search == data[mid]) {
                arrIdx[idx] = mid; //saving index of max. value in array
                idx++; //index of array increased
                return BSIndex(data, search, mid + 1, right, arrIdx , idx);
            }else if (data[mid] > search) {
                return BSIndex(data, search, left, mid - 1, arrIdx, idx);
            } else {
                return BSIndex(data, search, mid + 1, right, arrIdx, idx);
            }
        } 
        if(right == left){ //base line
            if(search == data[left]){
                arrIdx[idx] = left; //save index to array
                return arrIdx; //return array
            }
        }
        return arrIdx; //return array
    }
}
