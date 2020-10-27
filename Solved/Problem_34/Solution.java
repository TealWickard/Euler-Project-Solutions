package Solved.Problem_34;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        for(int i = 10; i <= 7 * quickFac(9); i++){
            int sum = 0;
            for(char c : Integer.toString(i).toCharArray()){
                sum += quickFac(c - 48);
            }
            if(sum == i) answer += sum;
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static int quickFac(int i){
        switch(i){
            case 0:
            return 1;
            case 1:
            return 1;
            case 2:
            return 2;
            case 3:
            return 6;
            case 4:
            return 24;
            case 5:
            return 120;
            case 6:
            return 720;
            case 7:
            return 5040;
            case 8:
            return 40320;
            case 9:
            return 362880;
        }
        return -1;
    }
}