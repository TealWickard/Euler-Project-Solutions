package Solved.Problem_36;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        int curr = 1;
        while (curr < 1000000){
            if(isPalindrome(Integer.toString(curr)) && isPalindrome(Integer.toBinaryString(curr))) answer += curr;
            curr++;
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static boolean isPalindrome(String input){
        for(int i = 0; i < input.length()/2; i++){
            if(input.charAt(i) != input.charAt(input.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}