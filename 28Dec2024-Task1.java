/*
Author: Prithbiraj Mahanta
Date: 28-12-2024
TaskNo: 1
Platform: Leetcode
Problem: 2022

*/











class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {

    //     //MINE
    //     int[][] res = new int[m][n];
    //     if(original.length!=m*n) return new int[0][0];
    //     int t = 0;
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             res[i][j] = original[t];
    //             t++;
    //         }
    //     }
    //  return res;




    // //OPTIMIZED 
    // // If dimensions are invalid, return an empty 2D array
    //     if (original.length != m * n) return new int[0][0];
        
    //     int[][] res = new int[m][n];
    //     for (int i = 0; i < original.length; i++) {
    //         res[i / n][i % n] = original[i];
    //     }
        
    //     return res;





        //OPTIMIZED-2
        if (m * n != original.length) {
            return new int[0][0]; 
        }
        
        int[][] result = new int[m][];

        for (int i = 0; i < m; i++) {
            result[i] = Arrays.copyOfRange(original, i * n, i * n + n);
        }

        return result;

    }
}
