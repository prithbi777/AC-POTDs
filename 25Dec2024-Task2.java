/*
Author: Prithbiraj Mahanta
Date: 25-12-2024
TaskNo: 2
Platform: Codeforces
Problem: 750A

*/



import java.util.*;
 
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       int i =1;
       int count = 0;
       int left= 240-k;
       while(i*5<=left && i<=n){
                left -= i*5;
                i++;
                count++;
       }
       System.out.println(count);
    }
}



