package Solved.Problem_58;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        int primesFound = 3;
        int r = 3;
        while(true){
            if(isPrime(4 * r * r - 6 * r + 3)) primesFound++;
            if(isPrime(4 * r * r - 8 * r + 5)) primesFound++;
            if(isPrime(4 * r * r - 10 * r + 7)) primesFound++;
            if(primesFound * 10 < 4 * r - 3){
                answer = 2 * r - 1;
                break;
            }
            r++;
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}