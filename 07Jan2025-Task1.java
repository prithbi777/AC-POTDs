/*
Author: Prithbiraj Mahanta
Date: 07-01-2025
TaskNo: 1
Platform: LT
Problem: https://leetcode.com/problems/arranging-coins/description/

*/





class Solution {
    public int arrangeCoins(int n) {

        // //brute force 
        // int completeRows = 0,i = 1;
        // while(i<=n){
        //     completeRows++;
        //     n -= i;
        //     i++;
        // }
        // return completeRows;



        //optimized(using bs)
        long left = 1, right = n;
        while (left<=right) {
            long mid = left + (right-left)/2;
            long sum = (mid*(mid+1))/2;
            if(sum>n){
                right = mid -1; 
            }else{
                left = mid +1;
            }
        }
        return (int)right;
    }
}



