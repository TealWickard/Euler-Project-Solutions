package Solved.Problem_25;


import java.math.BigInteger; 

public class Solution {
    public static void main(String[] args){
        int answer = 1;
        BigInteger f1 = new BigInteger("1");
        BigInteger f2 = new BigInteger("1");
        while(f1.toString().length() < 1000){
            BigInteger buffer = f1.add(f2);
            f1 = f2;
            f2 = buffer;
            answer++;
        }
        System.out.printf("The answer is: %s", answer);
    }
}