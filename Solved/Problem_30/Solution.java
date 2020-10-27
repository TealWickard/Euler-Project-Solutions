package Solved.Problem_30;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        for(int i = 2; i < 354294; i++){
            int sum = 0;
            for(char c : Integer.toString(i).toCharArray()){
                sum += Math.pow(c - 48, 5);
            }
            if(sum == i) answer += sum;
        }
        System.out.printf("The answer is: %s", answer);
    }
}