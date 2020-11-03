package Solved.Problem_55;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args){
        int answer = 0;
        int curr = 10;
        while(curr < 10000){
            int iterations = 0;
            BigInteger num = new BigInteger(Integer.toString(curr));
            iterate:
            while(true){
                num = num.add(reverse(num));
                if(isPalindrome(num.toString())) break iterate;
                if(iterations == 50){
                    answer++;
                    break;
                }
                iterations++;
            }
            curr++;
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static BigInteger reverse(BigInteger input){
        StringBuilder toReturn = new StringBuilder();
        char[] chars = input.toString().toCharArray();
        for(int i = 0; i < chars.length; i++){
            toReturn.append(chars[chars.length - i - 1]);
        }
        return new BigInteger(toReturn.toString());
    }
    public static boolean isPalindrome(String input){
        char[] chars = input.toCharArray();
        for(int i = 0; i <= chars.length / 2; i++){
            if(chars[i] != chars[chars.length - i - 1]) return false;
        }
        return true;
    }
}