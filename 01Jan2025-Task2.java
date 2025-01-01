/*
Author: Prithbiraj Mahanta
Date: 01-01-2025
TaskNo: 2
Platform: Leetcode
Problem: 55

*/


class Solution {
    public boolean canJump(int[] nums) {









        //Optimized
        int finalPos = nums.length-1;
        for(int i=finalPos-1;i>=0;i--){
            if(nums[i]+i>=finalPos){
                finalPos = i;
            }
        }
        return (finalPos==0);
    }
}





