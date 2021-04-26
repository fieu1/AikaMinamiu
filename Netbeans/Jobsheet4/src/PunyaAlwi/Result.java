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
public class Result {
    public int maximum;
    public int minimum;
    
    public void max_min(int[] arr, int index_first, int index_last, Result result){
        int index_mid;
        Result result1 = new Result();
        Result result2 = new Result();
        
        if(index_first == index_last){
            result.minimum = result.maximum = arr[index_first];
        } else if(index_last - index_first == 1){
            if(arr[index_first] > arr[index_last]){
                result.minimum = arr[index_last];
                result.maximum = arr[index_first];
            } else{
                result.minimum = arr[index_first];
                result.maximum = arr[index_last];
            }
        } else{
            index_mid = (index_first + index_last)/2;
            max_min(arr, index_first, index_mid, result1);
            max_min(arr, index_mid+1, index_last, result2);
            
            result.minimum = (result1.minimum < result2.minimum) ? result1.minimum : result2.minimum;
            result.maximum = (result1.maximum > result2.maximum) ? result1.maximum : result2.maximum;
        }
    }
}
