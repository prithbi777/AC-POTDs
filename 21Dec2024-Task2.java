/*
Author: Prithbiraj Mahanta
Date: 21-12-2024
TaskNo: 2
Platform: GFG
Problem: GCD of two numbers

*/

class Solution {
    public static int gcd(int a, int b) {
        return b==0? a: gcd(b, a%b);
    }
}
