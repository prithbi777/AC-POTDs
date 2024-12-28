/*
Author: Prithbiraj Mahanta
Date: 28-12-2024
TaskNo: 2
Platform: Codeforces
Problem: 1828B - Permutation Swap

*/










import java.util.*;
 
 
public class Main {
    private static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t!=0) {
            int n = sc.nextInt();
            int ans = 0;
            int i =0;
            while (i!=n) {
                i++;
                int no = sc.nextInt();
                int diff = Math.abs(no-i);
                ans = gcd(diff, ans);
 
            }
            System.out.println(ans);
            t--;
            
        }
    }
    
    
}
