/*
Author: Prithbiraj Mahanta
Date: 01-01-2025
TaskNo: 1
Platform: Leetcode
Problem: 1952

*/








class Solution {
    public boolean isThree(int n) {
        int count = 0;
        
        // Iterate through all possible divisors from 1 to n
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                count++; // Increment count if i is a divisor of n
            }
     
        }
        
        // Return true if there are exactly 3 divisors, otherwise false
        return count == 2;
    }
}
