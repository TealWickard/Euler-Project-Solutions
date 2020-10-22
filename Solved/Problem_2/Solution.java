package Solved.Problem_2;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        int first = 1;
        int second = 2;
        while(first < 4000000){
            if(first % 2 == 0){
                answer += first;
            }
            int buffer = first;
            first = second;
            second += buffer;
        }
        System.out.printf("The answer is: %s", answer);
    }
}