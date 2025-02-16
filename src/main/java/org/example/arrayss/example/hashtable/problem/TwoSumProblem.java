package org.example.arrayss.example.hashtable.problem;

import java.util.HashMap;

/**
 * @author Bibash Bogati
 * @created 2025-02-13
 */
public class TwoSumProblem {


//    Given an array of integers nums and an integer target, return the indices of the
//    two numbers such that they add up to the target.

//    Input: nums = [2, 7, 11, 15], target = 9
//    Output: [0, 1]


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        System.out.println(result[0] + ", " + result[1]);
    }


    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // we simply put value and its index in hasmap and if the difference between current element matches any with taht already appears means
//            that particular element and this element will add up to the target
                    // eg : target = 7
            // current element = 4 , difference = 3
            // if the map contains 3 element already that means that particular index and current index value will made up to our result
            int difference = target - nums[i];

            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        }

        return new int[0];
    }

}
