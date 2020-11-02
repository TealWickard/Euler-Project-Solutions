package Solved.Problem_49;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){
        String answer = "";
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i = 1001; i < 10000; i += 2){
            if(isPrime(i)) primes.add(i);
        }
        for(int i = 0; i < primes.size(); i++){
            for(int j = i + 1; j < primes.size(); j++){
                int dif = primes.get(j) - primes.get(i);
                if(primes.contains(primes.get(j) + dif)){
                    if(compDigits(primes.get(i), primes.get(j)) && compDigits(primes.get(j), primes.get(j) + dif) && primes.get(i) != 1487){
                        answer += Integer.toString(primes.get(i)) + Integer.toString(primes.get(j)) + Integer.toString(primes.get(j) + dif);
                    }
                }
            }
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static boolean compDigits(int num1, int num2){
        int[] digits1 = new int[10];
        int[] digits2 = new int[10];
        for(char c : Integer.toString(num1).toCharArray()){
            digits1[c - 48]++;
        }
        for(char c : Integer.toString(num2).toCharArray()){
            digits2[c - 48]++;
        }
        for(int i = 0; i < 10; i++){
            if(digits1[i] != digits2[i]) return false;
        }
        return true;
    }
}