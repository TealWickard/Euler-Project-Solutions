package Solved.Problem_4;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        int curr = 999;
        int largestAnswer = 1;
        while(curr > Math.sqrt(largestAnswer) || largestAnswer == 1){
            int smallerCurr = curr;
            while(smallerCurr > 99){
                answer = curr * smallerCurr;
                char[] chars = Integer.toString(answer).toCharArray();
                boolean doBreak = true;
                for(int i = 0; i < chars.length/2; i++){
                    if(chars[i] != chars[chars.length - i - 1]){
                        doBreak = false;
                    }
                }
                if(doBreak){
                    if(answer > largestAnswer || largestAnswer == 1) largestAnswer = answer;
                    break;
                }
                smallerCurr--;
            }
            curr--;
        }
        System.out.printf("The answer is: %s", largestAnswer);
    }
}