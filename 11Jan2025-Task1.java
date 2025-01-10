/*
Author: Prithbiraj Mahanta
Date: 11-01-2025
TaskNo: 1
Platform: LT
Problem: https://leetcode.com/problems/koko-eating-bananas/description/

*/





class Solution {
    private static int maxEle(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int val:arr){
            max = Math.max(val, max);
        }
        return max;
    }
    private static int calTotalTime(int[] piles, int h){
        int totalTime = 0;
        for(int val:piles){
            totalTime += Math.ceil((double)(val)/(double)(h));
        }
        return totalTime;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int right = maxEle(piles);
        int left = 1;
        while (left<=right) {
            int mid = left+(right-left)/2;
            if(calTotalTime(piles, mid)<=h){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return (left);
    }
}
