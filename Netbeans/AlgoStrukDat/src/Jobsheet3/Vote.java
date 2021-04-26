/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

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
                return nums[lo]; //return value
            } else { //if the value wasn't same
                return 0; //return 0
            }
        } else if (hi > lo) { //recursive case
            int mid = (hi - lo) / 2 + lo; // slice to two area
            int left = VotingRec(nums, lo, mid); //recursive function
            int right = VotingRec(nums, mid + 1, hi); //recursive function
            if (left != 0) { //if left has value more than 0
                return left; //return value
            }
            if (right != 0) { //if right has value more than 0
                return right; //return value
            }
            return 0; //for fulfill return statement

        }
        return 0; //for fulfill return statement

    }
}
