/*
Author: Prithbiraj Mahanta
Date: 06-01-2025
TaskNo: 2
Platform: LT
Problem: https://leetcode.com/problems/binary-search/description/

*/




class Solution {
    public int search(int[] nums, int target) {
         int left = 0, right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(target>nums[mid]){
                left = mid+1;
            }
            else if(target<nums[mid]){
                right = mid-1;
            }else{
                return mid;
                
            }
        }

       return -1;
    }
}
