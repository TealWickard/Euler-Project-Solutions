package Solved.Problem_15;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args){
        BigInteger answer = new BigInteger("1");
        for(int i = 21; i < 41; i++){
            answer = answer.multiply(new BigInteger(Integer.toString(i)));
        }
        for(int i = 1; i < 21; i++){
            answer = answer.divide(new BigInteger(Integer.toString(i)));
        }
        System.out.printf("The answer is: %s", answer);
    }
}