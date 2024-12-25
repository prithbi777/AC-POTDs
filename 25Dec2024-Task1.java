/*
Author: Prithbiraj Mahanta
Date: 25-12-2024
TaskNo: 1
Platform: Leetcode
Problem: 455

*/



class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gp = 0, sp=0;
        while(gp<g.length && sp<s.length){
            if(s[sp]>=g[gp]){
                gp++;
                sp++;
            }else{
                sp++;
            }
        }
        return (gp);
    }
}
