/*
Author: Prithbiraj Mahanta
Date: 22-12-2024
TaskNo: 2
Platform: Leetcode
Problem: 3190

*/



class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int val: nums){
            if(val%3!=0)
                count++;
        }
        return (count);
    }
}

