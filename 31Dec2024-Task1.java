/*
Author: Prithbiraj Mahanta
Date: 31-12-2024
TaskNo: 1
Platform: Leetcode
Problem: 151

*/







class Solution {
    public String reverseWords(String s) {
       // Split the string by spaces and filter out empty strings
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        // Traverse the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        
        return (result.toString()); 
    }
}
