package Solved.Problem_27;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        int longest = 1;
        int a = -999;
        int b = 1;
        while(b < 1000){
            b += 2;
            if(!isPrime(b)) continue;
            a = -999;
            while(a < 1000){
                int n = 1;
                while(isPrime((int)Math.pow(n, 2) + n * a + b)){
                    n++;
                }
                if(n > longest){
                    longest = n;
                    answer = a * b;
                }
                a += 2;
            }
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}