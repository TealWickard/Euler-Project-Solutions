package Solved.Problem_1;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        int curr = 1;
        while(curr < 1000){
            if(curr % 3 == 0){
                answer += curr;
            }
            if(curr % 5 == 0 && curr % 3 != 0){
                answer += curr;
            }
            curr++;
        }
        System.out.printf("The answer is: %s", answer);
    }
}