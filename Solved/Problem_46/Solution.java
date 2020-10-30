package Solved.Problem_46;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){
        int curr = 3;
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        while(true){
            if(isPrime(curr, primes)){
                primes.add(curr);
            } else {
                int i = 1;
                boolean doBreak = false;
                while(2 * i * i < curr && !doBreak){
                    if(primes.contains(curr - 2 * i * i)){
                        doBreak = true;
                    }
                    i++;
                }
                if(!doBreak){
                    break; // I realize my variable naming convention is unintuitive
                }
            }
            curr += 2;
        }
        System.out.printf("The answer is: %s", curr);
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