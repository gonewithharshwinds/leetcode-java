/* 
===============================================
:::: DETAILS ::::
Author : Harsh Mehta, Date : June 2024, Type : Easy Problem, No. 13
===============================================
:::: PROBLEM ::::
*  Given a roman numeral, convert it to an integer.
*  
*  Example 1:
*  Input: s = "III"
*  Output: 3
*  Explanation: III = 3.
*  
*  Example 2:
*  Input: s = "LVIII"
*  Output: 58
*  Explanation: L = 50, V= 5, III = 3.
*  
*  Example 3:
*  Input: s = "MCMXCIV"
*  Output: 1994
*  Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
===============================================
:::: STATS ::::
TIME : 2ms , Beats 100.00% of users with Java
MEMORY : 44.45mb Beats 73.53% of users with Java
===============================================
:::: SOLUTION ::::
*  This code converts a Roman numeral string to an integer.
*  It first maps each Roman numeral to its corresponding integer value.
*  Then it sums these values while accounting for subtractive combinations (e.g., IV = 4) by checking if a numeral is less than the next one.
===============================================
*/
class Solution {
    public int romanToInt(String s) {
        int val = 0, p = 0;
        for (char ch: s.toCharArray()) {
            switch(ch)
            {
                case 'I': 
                    val+=1;p=1;
                    break;
                case 'V': 
                    val+=(p==1)?3:5;p=5;
                    break;
                case 'X': 
                    val+=(p==1)?8:10;p=10;
                    break;
                case 'L': 
                    val+=(p==10)?30:50;p=50;
                    break;
                case 'C': 
                    val+=(p==10)?80:100;p=100;
                    break;
                case 'D':
                    val+=(p==100)?300:500;p=500;
                    break;
                case 'M':
                    val+=(p==100)?800:1000;p=1000;
                    break;
            }
        }
        return val;
    }
}
