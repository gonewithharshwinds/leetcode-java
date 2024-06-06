/* 
===============================================
:::: DETAILS ::::
Author : Harsh Mehta, Date : June 2024, Type : Daily Challenge, No. 846
===============================================
:::: PROBLEM ::::
*  Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize, and consists of groupSize consecutive cards.
*  Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize, return true if she can rearrange the cards, or false otherwise.
*
*  Example 1:
*
*  Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
*  Output: true
*  Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
*  Example 2:
*
*  Input: hand = [1,2,3,4,5], groupSize = 4
*  Output: false
*  Explanation: Alice's hand can not be rearranged into groups of 4.
===============================================
:::: STATS ::::
TIME : 8ms , Beats 100.00% of users with Java
MEMORY : 44.66mb , Beats 99.46% of users with Java
===============================================
:::: SOLUTION ::::
*  This algorithm checks if an array of integers can be divided into consecutive subsequences of a specified group size. 
*  It first sorts the array and iteratively attempts to form consecutive groups, marking elements as used once they are part of a valid group. 
*  If any group cannot be completed, the function returns false; otherwise, it returns true.
===============================================
*/
class Solution {
    public boolean findsucessors(int[] hand, int groupSize, int i, int n) {
        int f = hand[i] + 1;
        hand[i] = -1;
        int count = 1;
        i += 1;
        while (i < n && count < groupSize) {
            if (hand[i] == f) {
                f = hand[i] + 1;
                hand[i] = -1;
                count++;
            }
            i++;
        }
        if (count != groupSize)
            return false;
        else
            return true;
    }

    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0)
            return false;
        Arrays.sort(hand);
        int i = 0;
        for (; i < n; i++) {
            if (hand[i] >= 0) {
                if (!findsucessors(hand, groupSize, i, n))
                    return false;
            }
        }
        return true;
    }
}
