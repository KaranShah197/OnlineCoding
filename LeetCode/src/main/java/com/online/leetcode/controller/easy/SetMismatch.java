/**
 * 645. Set Mismatch
 *
 * You have a set of integers s, which originally contains all the numbers from 1 to n.
 * Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
 * which results in repetition of one number and loss of another number.
 *
 * You are given an integer array nums representing the data status of this set after the error.
 *
 * Find the number that occurs twice and the number that is missing and return them in the form of an array.
 *
 * Example 1:
 *
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 *
 * Example 2:
 *
 * Input: nums = [1,1]
 * Output: [1,2]
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * 1 <= nums[i] <= 104
 *
 */

package com.online.leetcode.controller.easy;

import java.util.HashMap;
import java.util.Map;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, len = nums.length;

        for(int n:nums){
            if(map.containsKey(n)){
                res[0] = n;
            } else
                map.put(n, 1);
            sum += n;
        }
        res[1] = (len*(len + 1) / 2) - sum + res[0];

        return res;
    }
}
