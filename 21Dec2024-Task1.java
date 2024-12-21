/*
Author: Prithbiraj Mahanta
Date: 21-12-2024
TaskNo: 1
Platform: Leetcode
Problem: 3110

*/

class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i=0;i<s.length()-1;i++){
            sum += Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return sum;
    }
}
