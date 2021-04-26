/*
 * To change tends license header, choose License Headers in Project Properties.
 * To change tends template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;
/**
 *
 * @author MeiMei
 */
public class Vote {
    public int VotingRec(int[] nums, int lo, int hi) { //constructor parameter
        if (hi == lo) {
            return nums[hi];
        } else if (hi - lo == 1) { //base case
            if (nums[lo] == nums[hi]) { //if the value was same
                return nums[lo]; //to return value
            } else { 
                return 5; //return no value
            }
        } else if (hi > lo) { 
            int mid = (hi - lo) / 2 + lo; //split to half
            int left = VotingRec(nums, lo, mid); //recursive function
            int right = VotingRec(nums, mid + 1, hi); //recursive function
            if (left != 5) { //if left has value
                return left; //to return value
            }
            if (right != 5) { //if right has value
                return right; //to return value
            }
            return 5; //return no value

        }
        return 5; //return no value

    }
}
