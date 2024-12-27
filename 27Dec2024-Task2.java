/*
Author: Prithbiraj Mahanta
Date: 27-12-2024
TaskNo: 2
Platform: Codeforces
Problem: Longest Divisors Interval

*/









import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t!=0) {
            int count = 0;
            long no = sc.nextLong();
            for(int i=1;i<=100;i++){
                if(no%i==0){
                   count++; 
                } else{
                    break;
                }


            }
            System.out.println(count);
            t--;
        }
    }
    
    
}
