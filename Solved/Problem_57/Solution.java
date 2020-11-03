package Solved.Problem_57;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args){
        int answer = 0;
        BigInteger num = new BigInteger("3");
        BigInteger den = new BigInteger("2");
        for(int i = 1; i <= 1000; i++){
            if(num.toString().length() > den.toString().length())answer++;
            BigInteger buffer = new BigInteger(den.toString());
            den = den.add(num);
            num = num.add(buffer.multiply(new BigInteger("2")));
        }
        System.out.printf("The answer is: %s", answer);
    }
}