/*
Author: Prithbiraj Mahanta
Date: 11-01-2025
TaskNo: 2
Platform: LT
Problem: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

*/









class Solution {
    private static int findMax(int[] weights){
        int max = Integer.MIN_VALUE;
        for(int val:weights){
            max = Math.max(val, max);
        }
        return max;
    }
    private static int findSum(int[] weights){
        int sum = 0;
        for(int val: weights){
            sum += val;
        }
        return sum;
    }
    private static int findReqDays(int[] weights, int cap){
        int sum = 0;
        int days = 0;
        for(int val:weights){
            if(sum + val > cap){
                days++;
                sum = val;
            }else{
                sum += val;
            }
        }
        return days+1;
    }
    public int shipWithinDays(int[] weights, int days) {
            int left = findMax(weights);
            int right = findSum(weights);
            // System.out.println(left + " "+right);
            while (left<=right) {
                int mid = left + (right-left)/2;
                int reqDays = findReqDays(weights, mid);
                // System.out.println(reqDays);
                if(reqDays<=days){
                    right = mid -1;
                }else{
                    left = mid + 1;
                }
            }
            return (left);
    }
}
