/*
Author: Prithbiraj Mahanta
Date: 29-12-2024
TaskNo: 1
Platform: Codeforces
Problem: 26A - Almost Prime

*/




//MINE
import java.util.*;
public class Main {
    private static boolean isPrime(int n){
        if(n<=1) return false;
        boolean isprime=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isprime = false;
                break;
            }
           
        }
       return isprime;
    }
    private static boolean isAPrime(int a){
        int i =1, count=0;
        while(i<=a){
            if(a%i==0 && isPrime(i)) count++;
            i++;
        }
        return count==2;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int count = 0;
        while (i<=n) {
            if(isAPrime(i)) count++;

            i++;
        }
        System.out.println(count); 
    }
  
}







//OPTIMIZED
// import java.util.Scanner;

// public class AlmostPrime {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();

//         // Array to store the count of distinct prime divisors for each number
//         int[] primeDivisors = new int[n + 1];

//         // Sieve-like approach to count prime divisors
//         for (int i = 2; i <= n; i++) {
//             if (primeDivisors[i] == 0) { // `i` is a prime number
//                 for (int j = i; j <= n; j += i) {
//                     primeDivisors[j]++;
//                 }
//             }
//         }

//         // Count numbers with exactly two distinct prime divisors
//         int count = 0;
//         for (int i = 1; i <= n; i++) {
//             if (primeDivisors[i] == 2) {
//                 count++;
//             }
//         }

//         System.out.println(count);
//     }
// }


