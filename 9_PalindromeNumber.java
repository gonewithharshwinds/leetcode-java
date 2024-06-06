/* 
===============================================
:::: DETAILS ::::
Author : Harsh Mehta, Date : June 2024, Type : Easy Problem, No. 9
===============================================
:::: PROBLEM ::::
*  Given an integer x, return true if x is a palindrome, and false otherwise.
*  
*  Example 1:
*  Input: x = 121
*  Output: true
*  Explanation: 121 reads as 121 from left to right and from right to left.
*  
*  Example 2:
*  Input: x = -121
*  Output: false
*  Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
*  
*  Example 3:
*  Input: x = 10
*  Output: false
*  Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
===============================================
:::: STATS ::::
TIME : 5ms, Beats 73.35% of users with Java
MEMORY : 43.77mb , Beats 68.56%% of users with Java
===============================================
:::: SOLUTION ::::
*  This algorithm checks if a number is a palindrome by reversing its digits. 
*  The reverse method constructs the reversed number by iterating through each digit. 
*  The isPalindrome method compares the original number to its reversed version and returns true if they are equal.
===============================================
*/
class Solution {
    public int reverse(int num) {
        int r = 0;
        while ( num>0 ) {
            r = ( r*10 ) + ( num%10 );
            num /= 10;
        }
        return r;
    }

    public boolean isPalindrome(int x) {
        int y=reverse(x);
        return x==y;
    }
}
