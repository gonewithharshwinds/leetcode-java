/* 
===============================================
:::: DETAILS ::::
Author : Harsh Mehta, Date : June 2024, Type : Easy Problem, No. 14
===============================================
:::: PROBLEM ::::
*  Write a function to find the longest common prefix string amongst an array of strings.
*  If there is no common prefix, return an empty string "".
*  
*  
*  Example 1:
*  Input: strs = ["flower","flow","flight"]
*  Output: "fl"
*  
*  Example 2:
*  Input: strs = ["dog","racecar","car"]
*  Output: ""
*  Explanation: There is no common prefix among the input strings.
===============================================
:::: STATS ::::
TIME : 0ms , Beats 100.00% of users with Java
MEMORY : 41.23mb Beats 70.34% of users with Java
===============================================
:::: SOLUTION ::::
*  This code converts a Roman numeral string to an integer.
*  It first maps each Roman numeral to its corresponding integer value.
*  Then it sums these values while accounting for subtractive combinations (e.g., IV = 4) by checking if a numeral is less than the next one.
===============================================
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1; i<strs.length; i++){
            while (strs[i].indexOf(prefix) != 0 ){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
