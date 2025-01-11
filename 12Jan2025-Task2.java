/*
Author: Prithbiraj Mahanta
Date: 12-01-2025
TaskNo: 2
Platform: GFG
Problem: https://www.geeksforgeeks.org/problems/aggressive-cows/1

*/







class Solution {
    private static boolean isPos(int[] stalls, int minDis, int k){
        int countCows = 1;
        int lastPos = stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastPos >= minDis){
                countCows++;
                lastPos = stalls[i];
            }
            // if(countCows>=k) return true;

        }
        return countCows>=k;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int left= 0, right = stalls[stalls.length-1]-stalls[0];
        while(left<=right){
            int mid = left + (right-left)/2;
            if(isPos(stalls, mid, k)){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }     

        return (right);
    }
}
