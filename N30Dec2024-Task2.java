/*
Author: Prithbiraj Mahanta
Date: 30-12-2024
TaskNo: 2
Platform: Leetcode
Problem: 1689

*/



class Solution {
    public int minPartitions(String n) {
       int ans = 0;
       for(int i=0;i<n.length();i++){
          ans = Math.max(ans, n.charAt(i)-'0');
          if (ans == 9) break;
       }
       return ans;
    }
}
