/*
Author: Prithbiraj Mahanta
Date: 27-12-2024
TaskNo: 1
Platform: Leetcode
Problem: 202

*/




class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hst = new HashSet<>();
       while(true){
        int sum = 0;
        while(n!=0){
            
            sum += Math.pow((n%10), 2);
            n /= 10;
        }
        if(hst.contains(sum)){
            return false;
        }
        n = sum;
        hst.add(sum);
        if(sum ==1){
            return true;
        }
       }
       

    }
}

