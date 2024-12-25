/*
Author: Prithbiraj Mahanta
Date: 26-12-2024
TaskNo: 2
Platform: CSES
Problem: Trailing Zeros

*/


import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int zeros = 0;
        int currentPower = 5;
        
        while (n / currentPower > 0) {
            zeros += n / currentPower;
            currentPower *= 5;
        }
        
        System.out.println(zeros);
      
       




    }
}

