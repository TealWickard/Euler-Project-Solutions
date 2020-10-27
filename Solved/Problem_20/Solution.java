package Solved.Problem_20;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args){
        int answer = 0;
        BigInteger fact = new BigInteger("2");
        for(int i = 3; i <= 100; i++){
            fact = fact.multiply(new BigInteger(Integer.toString(i)));
        }
        for(char c : fact.toString().toCharArray()){
            answer += (c - 48);
        }
        System.out.printf("The answer is: %s", answer);
    }
}