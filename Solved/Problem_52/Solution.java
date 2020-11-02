package Solved.Problem_52;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        int digits = 2;
        int curr = 10;
        while(true){
            if(compDigits(curr)){
                answer = curr;
                break;
            }
            if(Math.floor(Math.log10(curr * 6)) > digits){
                digits++;
                curr = (int)Math.pow(10, digits);
            }
            curr++;
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static boolean compDigits(int num1){
        int[] digits1 = new int[10];
        int[] digits2 = new int[10];
        int[] digits3 = new int[10];
        int[] digits4 = new int[10];
        int[] digits5 = new int[10];
        int[] digits6 = new int[10];
        for(char c : Integer.toString(num1).toCharArray()){
            digits1[c - 48]++;
        }
        for(char c : Integer.toString(num1 * 2).toCharArray()){
            digits2[c - 48]++;
        }
        for(char c : Integer.toString(num1 * 3).toCharArray()){
            digits3[c - 48]++;
        }
        for(char c : Integer.toString(num1 * 4).toCharArray()){
            digits4[c - 48]++;
        }
        for(char c : Integer.toString(num1 * 5).toCharArray()){
            digits5[c - 48]++;
        }
        for(char c : Integer.toString(num1 * 6).toCharArray()){
            digits6[c - 48]++;
        }
        for(int i = 0; i < 10; i++){
            if(digits1[i] != digits2[i] || digits1[i] != digits3[i] || digits1[i] != digits4[i] || digits1[i] != digits5[i] || digits1[i] != digits6[i]) return false;
        }
        return true;
    }
}