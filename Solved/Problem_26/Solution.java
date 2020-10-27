package Solved.Problem_26;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args){
        int answer = 3;
        int longest = 1;
        BigInteger ten = new BigInteger("10");
        for(int i = 4; i < 1000; i++){
            if(i % 2 == 0 || i % 5 == 0) continue;
            int exp = 1;
            while(true){
                BigInteger toDivide = ten.pow(exp);
                if(toDivide.subtract(new BigInteger("1")).mod(new BigInteger(Integer.toString(i))).equals(new BigInteger("0"))){
                    if(exp > longest){
                        longest = exp;
                        answer = i;
                    }
                    break;
                }
                exp++;
            }
        }
        
        System.out.printf("The answer is: %s", answer);
    }
}