/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PunyaAlwi;


public class sort2 {
    int [][]arr;
    int pos=-1;
    int pos2=-1;
    public sort2(int [][]data){
        arr=data;
    }
    
    public void find(int search){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==search){
                    pos=i;
                    pos2=j;
                }
            }
        }
    }
    
    public void print(){
        if(pos==-1||pos2==-1){
            System.out.println("Number not found");
        }else{
            System.out.println("Number found on row "+pos+" and collumn "+pos2);
        }
    }
}
