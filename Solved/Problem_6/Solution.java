package Solved.Problem_6;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        int smallSum = 0;
        int largeSum = 0;
        for(int i = 1; i <= 100; i++){
            smallSum += i*i;
            largeSum += i;
        }
        largeSum *= largeSum;
        answer = largeSum - smallSum;
        System.out.printf("The answer is: %s", answer);
    }
}