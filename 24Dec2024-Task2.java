/*
Author: Prithbiraj Mahanta
Date: 24-12-2024
TaskNo: 2
Platform: Codeforces
Problem: 520A

*/




import java.util.*;

public class Such {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        String st = str.toLowerCase();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(st.charAt(i));
        }
        if(set.size()==26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
