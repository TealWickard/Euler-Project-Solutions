package Solved.Problem_7;
public class Solution {
    public static void main(String[] args){
        int count = 1;
        int answer = 3;
        while(true){
            if(isPrime(answer)){
                count++;
                if(count == 10001) break;
            }
            answer += 2;
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