package Solved.Problem_10;
public class Solution {
    public static void main(String[] args){
        long answer = 2;
        int curr = 3;
        while(curr < 2000000) {
            if(isPrime(curr)) answer += curr;
            curr += 2;
        }
        System.out.printf("The answer is: %s", answer);
    }
    /* Taken from Problem 7 */
    public static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}