package Problem_50;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){
        int answer = 0;
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        for(int i = 3; i < 1000000; i += 2){
            if(isPrime(i, primes)) primes.add(i);
        }
        int longest = 0;
        int lowerBound = 0;
        int sum = 0;
        int curr = 0;
        while(sum < 1000000){
            sum += primes.get(curr);
            if(isPrime(sum, primes)){
                longest = curr;
                lowerBound = sum;
            } 
            curr++;
        }
        int length = longest + 1;
        int startAt = 1;
        while(true){
            sum = lowerBound;
            for(int i = 0; i < startAt; i++){
                sum -= primes.get(i);
                sum += primes.get(i + length);
            }
            if(sum > 1000000) break;
            int testLength = length + 1;
            while(sum < 1000000){
                if(isPrime(sum, primes)){
                    longest = testLength - curr;
                    answer = sum;
                }
                sum += primes.get(curr + testLength);
                testLength++;
            }
            startAt++;
        }
        System.out.println(lowerBound);
        System.out.printf("The answer is: %s", answer);
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