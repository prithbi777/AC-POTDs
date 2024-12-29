/*
Author: Prithbiraj Mahanta
Date: 30-12-2024
TaskNo: 1
Platform: Leetcode
Problem: 238

*/



class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Calculate left products
        answer[0] = 1; // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate right products and multiply with left products
        int right = 1; // No elements to the right of the last element
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= right; // Multiply with the right product
            right *= nums[i];  // Update the right product
        }

        return answer;
    }
}






