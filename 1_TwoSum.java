/* 
===============================================
:::: DETAILS ::::
Author : Harsh Mehta, Date : June 2024, Type : Easy Problem, No. 1
===============================================
:::: PROBLEM ::::
*  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
*  You may assume that each input would have exactly one solution, and you may not use the same element twice.
*  You can return the answer in any order.
*
*  Example 1:
*  Input: nums = [2,7,11,15], target = 9
*  Output: [0,1]
*  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*  Example 2:
*  
*  Input: nums = [3,2,4], target = 6
*  Output: [1,2]
*  Example 3:
*  
*  Input: nums = [3,3], target = 6
*  Output: [0,1]
===============================================
:::: STATS ::::
TIME : 0ms , Beats 100.00% of users with Java
MEMORY : 44.53mb , Beats 80.17% of users with Java
===============================================
:::: SOLUTION ::::
*  This algorithm finds two indices in an array whose elements sum up to a given target by using a nested loop. 
*  The outer loop iterates through possible differences between indices, while the inner loop checks pairs of indices with that difference. 
*  When a pair is found that sums to the target, their indices are returned.
===============================================
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
       for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j - i] == target) {
                    return new int[]{j, j - i};
                }
            }
        }
        return null;
    }
}
