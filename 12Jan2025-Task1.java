/*
Author: Prithbiraj Mahanta
Date: 12-01-2025
TaskNo: 1
Platform: GFG
Problem: https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1

*/








class Solution {
     private static boolean isPos(int[] nums , int mid , int stds){
        int countStds = 1;
        long totalNow = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]+totalNow <=mid){
                totalNow += nums[i];
            }else{
                totalNow = nums[i];
                countStds++;
            }
        }
        return countStds<=stds;
    }
    public static int findPages(int[] arr, int k) {
        int n = arr.length;
        int m = k;
        if(m>n) return -1;
        int i=0;
        int[] nums = new int[n];
        for(int val:arr){
            nums[i] = val;
            i++;
        }

        int left = Integer.MIN_VALUE, right = 0;
        for(int val:nums){
            left = Math.max(val, left);
            right += val;
        }
        while(left<=right){
            int mid = left + (right - left)/2;
            if(isPos(nums, mid, m)){
                right = mid - 1;
            }else{
                left = mid +1;
            }
        }
        return (left);
    }
}
