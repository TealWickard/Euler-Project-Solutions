package Solved.Problem_14;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args){
        int answer = 0;
        int longest = 0;
        int count = 2;
        HashMap<Integer, Integer> lengths = new HashMap<>();
        lengths.put(1, 0);
        while(count < 1000000) {
            long curr = count;
            int length = 0;
            while(curr >= count){
                if(curr % 2 == 0) curr /= 2;
                else curr = curr * 3 + 1;
                length++;
            }
            length += lengths.get((int)curr);
            lengths.put(count, length);
            if(length > longest) {
                longest = length;
                answer = count;
            }
            count++;
        }
        System.out.printf("The answer is: %s", answer);
    }
}