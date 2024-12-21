/*
Author: Prithbiraj Mahanta
Date: 22-12-2024
TaskNo: 1
Platform: Leetcode
Problem: 136

*/


class Solution {
    public int singleNumber(int[] nums) {
    int xorr = 0;
     for(int i=0;i<nums.length;i++){
        xorr = xorr ^ nums[i];
     }

     return xorr;
    }
}