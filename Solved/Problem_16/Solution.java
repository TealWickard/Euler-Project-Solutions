package Solved.Problem_16;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args){
        int answer = 0;
        BigInteger sumDigits = new BigInteger("2");
        sumDigits = sumDigits.pow(1000);
        for(char c : sumDigits.toString().toCharArray()){
            answer += (c - 48);
        }
        System.out.printf("The answer is: %s", answer);
    }
}