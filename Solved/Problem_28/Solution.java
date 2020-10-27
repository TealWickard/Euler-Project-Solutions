package Solved.Problem_28;
public class Solution {
    public static void main(String[] args){
        long answer = 0;
        int R = 501;
        answer = ((16 * R)/6 * (R + 1) * (2 * R + 1)) - (14 * R * (R + 1)) + 16 * R - 3;
        System.out.printf("The answer is: %s", answer);
    }
}