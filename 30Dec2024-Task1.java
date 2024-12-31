/*
Author: Prithbiraj Mahanta
Date: 30-12-2024
TaskNo: 1
Platform: Leetcode
Problem: 238

*/


class Solution {
    public int[] productExceptSelf(int[] nums) {
        ////mine
    //     int[] prefixmul = new int[nums.length];
    //   int[] suffixmul = new int[nums.length];
    //   prefixmul[0] = 1;
    //   suffixmul[nums.length-1] = 1;
    //   for(int i=1;i<nums.length;i++){
    //     prefixmul[i] = prefixmul[i-1]*nums[i-1];
    //   }
    //   for(int i=nums.length-2;i>=0;i--){
    //       suffixmul[i] = suffixmul[i+1]*nums[i+1];
    //   }
    //   int[] ans = new int[nums.length];
    //   for(int i=0;i<nums.length;i++){
    //     ans[i] = suffixmul[i]*prefixmul[i];
    //   }
    // return ans;







    // OPTIMIZED: space O(1)
   
        int[] ans = new int[nums.length];

        // Step 1: Initialize the answer array with prefix products
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate suffix products and update the answer array
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        // Print the result
        return ans;




    }
}


