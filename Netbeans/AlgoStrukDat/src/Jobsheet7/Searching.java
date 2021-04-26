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
public class Searching {
    public int[] data;
    public int totData;
    
    public Searching(int[] Data, int totalData){
        totData = totalData;
        data = new int[totData];
        for(int i=0; i<totalData; i++){
            data[i] = Data[i];
        }
    }
    
    public int FindSeqSearch(int search){
        int position = -1;
        for(int j=0;j< totData;j++){
            if(data[j]==search){
                position = j;
                break;
            }
        }
        return position;
    }
    
    public void printData(){
        for(int i=0; i<totData;i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public void PrintPosition(int x, int pos){
        if(pos != -1){
            System.out.println("data : " + x + " found at index " + pos);
        } else {
            System.out.println("data " + x + " not found ");
        }
    }
    
    public int FindBinarySearch (int[] temp,int search, int left, int right){
        int mid;
        if(right >= left){
            mid = (right + left)/2;
            if(search == temp[mid]){
                return(mid);
            } else if(temp[mid] < search){
                return FindBinarySearch(temp, search, left, mid-1);
            } else {
                return FindBinarySearch(temp, search, mid+1, right);
            }
        }
        return -1;
    }
    
    public int[] merge(int temp[], int left, int middle, int right){
    
    for(int i= left; i<= right;i++){
        temp[i]= data[i];
    }
    int a = left;
    int b = middle+1;
    int c = left;
    
    while(a <= middle && b <= right){
        if(temp[a]<=temp[b]){
            data[c]= temp[a];
            a++;
        } else {
            data[c] = temp[b];
            b++;
        }
        c++;
    }
    
    int s = middle -a;
    for(int i = 0 ;i <=s;i++){
        data[c+i] = temp[a+i];
    }
    return data;
    }
    
    public int[] Sort(int data[], int left, int right){
        int[] newDat={};
        if(left<right){
            int middle = (left+right)/2;
            Sort(data, left, middle);
            Sort(data, middle+1, right);
            newDat=merge(data, left, middle, right);
            
        }
        return newDat;
    }
}
