/*
Author: Prithbiraj Mahanta
Date: 09-01-2025
TaskNo: 2
Platform: LT
Problem: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

*/







class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(left<=right){

            int mid = left + (right-left)/2;
            if(nums[mid]<nums[right]){
                ans = Math.min(ans, nums[mid]);
                right = mid -1;
            }else{
                ans = Math.min(ans, nums[left]);
                left = mid +1;
            }
        }
        return (ans);
    }
}
