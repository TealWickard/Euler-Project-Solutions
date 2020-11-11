package Solved.Problem_60;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){
        int answer = 0;
        ArrayList<Integer> primes = new ArrayList<>();
        int startAt = 13;
        int curr = startAt;
        while(curr < 34428){
            curr += 6;
            if(curr % 10 == 5) continue;
            if(quickIsPrime(curr) && testConcatPrime(curr, startAt)) primes.add(curr);
        }
        for(int i = 0; i < primes.size(); i++){
            int[] possibleAnswer = new int[5];
            possibleAnswer[0] = startAt;
            boolean doContinue = false;
            int toAdd = primes.get(i);
            for(int prime : possibleAnswer){
                if(prime == 0) continue;
                if(!testConcatPrime(prime, toAdd)) doContinue = true;
            }
            if(doContinue) continue;
            possibleAnswer[1] = toAdd;
            for(int j = i + 1; j < primes.size(); j++){
                possibleAnswer[2] = 0;
                possibleAnswer[3] = 0;
                possibleAnswer[4] = 0;
                doContinue = false;
                toAdd = primes.get(j);
                for(int prime : possibleAnswer){
                    if(prime == 0) continue;
                    if(!testConcatPrime(prime, toAdd)) doContinue = true;
                }
                if(doContinue) continue;
                possibleAnswer[2] = toAdd;
                for(int k = j + 1; k < primes.size(); k++){
                    possibleAnswer[3] = 0;
                    possibleAnswer[4] = 0;
                    doContinue = false;
                    toAdd = primes.get(k);
                    for(int prime : possibleAnswer){
                        if(prime == 0) continue;
                        if(!testConcatPrime(prime, toAdd)) doContinue = true;
                    }
                    if(doContinue) continue;
                    possibleAnswer[3] = toAdd;
                    for(int l = k + 1; l < primes.size(); l++){
                        possibleAnswer[4] = 0;
                        doContinue = false;
                        toAdd = primes.get(l);
                        for(int prime : possibleAnswer){
                            if(prime == 0) continue;
                            if(!testConcatPrime(prime, toAdd)) doContinue = true;
                        }
                        if(doContinue) continue;
                        possibleAnswer[4] = toAdd;
                        for(int num : possibleAnswer){
                            answer += num;
                        }
                        break;
                    }
                }
            }
        }
        System.out.printf("The answer is probably: %s", answer);
    }
    public static boolean testConcatPrime(int in1, int in2){
        long a = in1;
        long b = in2;
        return isPrime(a + b * (long)Math.pow(10, Math.floor(Math.log10(a)) + 1)) && isPrime(b + a * (long)Math.pow(10, Math.floor(Math.log10(b)) + 1));
    }
    public static boolean isPrime(long num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static boolean quickIsPrime(int num){
        for(int i = 7; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}