/*
Author: Prithbiraj Mahanta
Date: 02-01-2025
TaskNo: 2
Platform: Codeforces
Problem: 158A - Next Round

*/









import java.util.*;
public class Such{
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int k = sc.nextInt();
           int decide =0;
           int[] p = new int[n];
           for(int i=0;i<n;i++){
               p[i] = sc.nextInt();
               
           }
           for(int j=0;j<n;j++)
           {
               if(p[j]>=p[k-1] && p[j]>0 && p[j]<=100){
                   decide++;
               }
           }
           System.out.println(decide);
 
    }
}
