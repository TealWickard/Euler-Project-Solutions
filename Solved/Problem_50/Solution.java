package Solved.Problem_50;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){
        int answer = 0;
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        for(int i = 3; i < 1000000; i += 2){
            if(isPrime(i, primes)) primes.add(i);
        }
        int seqLengthLowerBound = 0;
        int seqLengthUpperBound = 0;
        int sum = 0;
        int curr = 0;
        while(sum < 1000000){
            sum += primes.get(curr);
            if(isPrime(sum, primes)){
                seqLengthLowerBound = curr;
                answer = sum;
            } 
            curr++;
        }
        seqLengthUpperBound = curr - 1;
        curr = 1;
        int longest = seqLengthLowerBound;
        while(true){
            if(sumPrimes(curr, curr + seqLengthLowerBound, primes) > 1000000) break;
            for(int i = seqLengthLowerBound; i <= seqLengthUpperBound; i++){
                int tempSum = sumPrimes(curr, curr + i, primes);
                if(tempSum > 1000000) break;
                if(isPrime(tempSum, primes)){
                    if(i - curr + 1 > longest){
                        answer = tempSum;
                        longest = i - curr + 1;
                    }
                }
            }
            curr++;
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static int sumPrimes(int startIndex, int endIndex, ArrayList<Integer> primes){
        int toReturn = 0;
        for(int i = startIndex; i < endIndex; i++){
            toReturn += primes.get(i);
        }
        return toReturn;
    }
    public static boolean isPrime(int test, ArrayList<Integer> primes){
        int curr = 0;
        int prime = primes.get(curr);
        while(prime <= Math.sqrt(test)){
            if(test % prime == 0) return false;
            curr++;
            prime = primes.get(curr);
        }
        return true;
    }
}