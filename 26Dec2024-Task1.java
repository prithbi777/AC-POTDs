/*
Author: Prithbiraj Mahanta
Date: 26-12-2024
TaskNo: 1
Platform: Leetcode
Problem: 2125

*/




class Solution {
    public int numberOfBeams(String[] bank) {

        //BRUITE FORCE
        // int currlno=0, prevlno = 0, gap = 0, ans = 0;
        //  boolean isnull = false;
        //  for(int i=0;i<bank.length;i++){
        //     for(int j=0;j<bank[0].length();j++){
        //         if(bank[i].charAt(j)=='1') prevlno++;
                
        //     }

        //     if(prevlno==0){
        //         isnull=true;
        //         gap = 1;
                
        //     }else if(gap==1 && isnull && currlno!=0 && prevlno!=0){
        //         ans += (currlno*prevlno);
        //         currlno = prevlno;
        //         prevlno = 0;
        //         gap = 0;
        //         isnull = false;
                
        //     }else if(currlno!=0 && prevlno!=0){
        //         ans += (currlno*prevlno);
        //         currlno = prevlno;
        //         prevlno = 0;
        //     }
        //     else{
        //         currlno = prevlno;
        //         prevlno = 0;

        //     }


        //  }
        //  return (ans);






        //  //OPTIMIZED-1
        //  List<Integer> temp = new ArrayList<>();
        //  int count = 0;
        //  for(int i=0;i<bank.length;i++){
        //     for(int j=0;j<bank[0].length();j++){
        //         if(bank[i].charAt(j)=='1') count++;
        //     }
        //     if(count!=0){
        //         temp.add(count);
        //         count=0;
        //     }
        //  }
        //  int ans = 0;
        //  for(int i=0;i<temp.size()-1;i++){
        //     ans += temp.get(i)*temp.get(i+1);
        //  }
        //  return (ans);







        // //OPTIMIZED-2
        if (bank.length < 2) {
            return 0;
        }
         int prev = 0, curr = 0, ans = 0;
         for(int i=0;i<bank.length;i++){
            for(int j=0;j<bank[0].length();j++){
                if(bank[i].charAt(j)=='1') curr++;
            }
            if(curr!=0){
                ans += curr*prev;
                prev = curr;
                curr = 0;
            }
           
         }
         return (ans);







        //OPTIMIZED-3
        //not possible in O(n)


    }
}
