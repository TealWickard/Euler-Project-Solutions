package Solved.Problem_47;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){
        int answer = 0;
        int curr = 3;
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        int inARow = 0;
        while(true){
            int distinctPrimes = distinctPrimes(curr, primes);
            if(distinctPrimes == 0){
                primes.add(curr);
                inARow = 0;
            } else if(distinctPrimes == 4){
                inARow++;
                if(inARow == 4){
                    answer = curr - 3;
                    break;
                }
            } else {
                inARow = 0;
            }
            curr++;
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static int distinctPrimes(int test, ArrayList<Integer> primes){
        int curr = 0;
        int sum = 0;
        int prime = primes.get(curr);
        while(prime <= test){
            if(sum == 0 && curr > Math.sqrt(test)) return 0; // Identify primes faster
            if(test % prime == 0){
                // 2 ^ 10 only counts for 1 factor, so we can reduce the amount we search through in these cases
                while(test % prime == 0){
                    test /= prime;
                }
                sum++;
                if(sum > 4) return sum; // We don't care about exact results above 4.
            }
            curr++;
            if(curr > primes.size() - 1) return 0; // Identify early primes faster
            prime = primes.get(curr);
        }
        return sum;
    }
}