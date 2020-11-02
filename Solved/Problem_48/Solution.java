package Solved.Problem_48;
public class Solution {
    public static void main(String[] args){
        long answer = 0;
        long modulo = (long)Math.pow(10, 10);
        for(int i = 1; i <= 1000; i++){
            long toAdd = 1;
            for(int j = 0; j < i; j++){
                toAdd = (i * toAdd) % modulo;
            }
            answer += toAdd;
        }
        System.out.printf("The answer is: %s", answer % modulo);
    }
}