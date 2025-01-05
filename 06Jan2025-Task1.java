/*
Author: Prithbiraj Mahanta
Date: 06-01-2025
TaskNo: 1
Platform: GFG
Problem: https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1

*/


class Solution {

    static int findFloor(int[] arr, int k) {
        int ansIdx = -1;
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]<=k){
                ansIdx = mid;
                left = mid+1;
            }else{
               
                 right = mid -1;
            }
        }
        return ansIdx;
    }
}
