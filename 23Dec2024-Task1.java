/*
Author: Prithbiraj Mahanta
Date: 23-12-2024
TaskNo: 2
Platform: Leetcode
Problem: 1365

*/


class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // //me
        // int[] res = new int[nums.length];
        // //coping the nums
        // for(int i=0;i<nums.length;i++)
        // {
        //     res[i] = nums[i];
        // }
        // Map<Integer, Integer> hmp = new HashMap<>();
        // Arrays.sort(nums);
        // hmp.put(nums[0], 0);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=nums[i-1]){
        //         hmp.put(nums[i], i);
        //     }
        // }
        // for(int i=0;i<res.length;i++){
        //     res[i] = hmp.get(res[i]);
        // }
        // return res;





        //optimized
        int[] freq = new int[101];
        for(int val: nums){
            freq[val]++;
        }
        for(int i=1;i<101;i++){
            freq[i] += freq[i-1];
        }

        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = nums[i]==0? 0: (freq[nums[i]-1]);
        }
        return res;


    }
}
