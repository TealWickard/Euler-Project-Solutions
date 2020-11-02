package Solved.Problem_53;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args){
        int answer = 0;
        for(int n = 23; n <= 100; n++){
            int r = 0;
            while(combi(n, r) < 1000000){
                r++;
            }
            answer += (n - 2 * r + 1);
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static int combi(int n, int r){
        BigInteger large = new BigInteger(Integer.toString(n));
        large = factorial(large);
        large = large.divide(factorial(new BigInteger(Integer.toString(r))));
        large = large.divide(factorial(new BigInteger(Integer.toString(n - r))));
        return Integer.parseInt(large.toString());
    }
    public static BigInteger factorial(BigInteger in){
        if(in.equals(new BigInteger("0"))) return new BigInteger("1");
        return in.multiply(factorial(in.subtract(new BigInteger("1"))));
    }
}