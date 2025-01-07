/*
Author: Prithbiraj Mahanta
Date: 08-01-2025
TaskNo: 2
Platform: GFG
Problem: https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1

*/



class Solution {
    public int nthRoot(int n, int m) {
     int left = 1, right = m;
        while(left<=right){
            int mid = left + (right-left)/2;
            if((int)Math.pow(mid, n) == m){
                return mid;
            }else if((int)Math.pow(mid, n)<m){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}

