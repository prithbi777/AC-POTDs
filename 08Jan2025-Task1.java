/*
Author: Prithbiraj Mahanta
Date: 08-01-2025
TaskNo: 1
Platform: LT
Problem: https://leetcode.com/problems/search-a-2d-matrix/description/

*/






class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0, right = (row*col-1);
        while(left<=right){
            int mid  = (left) + (right-left)/2;
            int compareTarget = matrix[mid/col][mid%col];
            if(compareTarget==target){
                return true;
            }else if(compareTarget>target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return (false);
    }
}
