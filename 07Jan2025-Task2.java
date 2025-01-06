/*
Author: Prithbiraj Mahanta
Date: 07-01-2025
TaskNo: 2
Platform: LT
Problem: https://leetcode.com/problems/search-insert-position/description/

*/




class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = -1;
        int left = 0, right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]<=target){
                if(nums[mid]==target){
                    return mid;
                }
                ans = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return (ans+1);
    }
}
