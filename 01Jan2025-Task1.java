/*
Author: Prithbiraj Mahanta
Date: 01-01-2025
TaskNo: 1
Platform: Leetcode
Problem: 1952

*/








// class Solution {
//     public boolean isThree(int n) {
//         int count = 0;
        
//         // Iterate through all possible divisors from 1 to n
//         for (int i = 1; i <= n/2; i++) {
//             if (n % i == 0) {
//                 count++; // Increment count if i is a divisor of n
//             }
     
//         }
        
//         // Return true if there are exactly 3 divisors, otherwise false
//         return count == 2;
//     }
// }












//OPTIMIZED
class Solution {
    public boolean isThree(int n) {
        // Check if n is a perfect square
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt != n) {
            return false; // Not a perfect square
        }

        // Check if the square root of n is a prime number
        return isPrime(sqrt);
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not a prime
            }
        }
        return true; // Prime number
    }
}

