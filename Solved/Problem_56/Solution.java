package Solved.Problem_56;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args){
        int answer = 0;
        for(int a = 1; a < 100; a++){
            for(int b = 1; b < 100; b++){
                BigInteger large = new BigInteger(Integer.toString(a));
                large = large.pow(b);
                int sum = 0;
                for(char c : large.toString().toCharArray()) sum += (c - 48);
                if(sum > answer) answer = sum;
            }
        }
        System.out.printf("The answer is: %s", answer);
    }
}