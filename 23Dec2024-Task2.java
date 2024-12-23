/*
Author: Prithbiraj Mahanta
Date: 23-12-2024
TaskNo: 2
Platform: Leetcode
Problem: 2027

*/


class Solution {
    public int minimumMoves(String s) {


        //OVERCOMPLICATED AND FAILED
    //     char[] carr = s.toCharArray();
    //     int moves = 0;
    //     //max 3
    //     for(int i=0;i<carr.length-2;i++){
    //         if(carr[i]=='X' && carr[i+1]=='X' && carr[i+2]=='X'){
    //                 carr[i] = carr[i+1] = carr[i+2] = 'O';
    //                 moves++;
    //         }
    //     }

    //     //max 2
    //    for(int i=0;i<carr.length-2;i++){
    //        if(carr[i]=='X' && carr[i+1]=='X' && carr[i+2]=='O'){
    //             carr[i] = carr[i+1] = 'O';
    //             moves++;
    //        }else if(carr[i]=='X' && carr[i+2]=='X' && carr[i+1] == 'O'){
    //             carr[i] = carr[i+2] = 'O';
    //             moves++;
    //        }else if(carr[i]=='O' && carr[i+2]=='X' && carr[i+1] == 'X'){
    //             carr[i+1] = carr[i+2] = 'O';
    //             moves++;
    //        }
    //    }

    //    //max 1
    //    for(int i=0;i<carr.length-2;i++){
    //        if(carr[i]=='X' && carr[i+1]=='O' && carr[i+2]=='O'){
    //             carr[i] = 'O';
    //             moves++;
    //        }else if(carr[i]=='O' && carr[i+2]=='O' && carr[i+1] == 'X'){
    //             carr[i+1] = 'O';
    //             moves++;
    //        }else if(carr[i]=='O' && carr[i+2]=='X' && carr[i+1] == 'O'){
    //             carr[i+2] = 'O';
    //             moves++;
    //        }
    //    }

    //    return (moves);






        //OPTIMIZED CODE(TRY TO UNDERSTAND THE PROBLEM FIRST)(AND DRY RUN TOO)
        int moves = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                // Apply a move and skip the next two characters
                moves++;
                i += 3;
            } else {
                // Move to the next character
                i++;
            }
        }

        return moves;
    }
}
