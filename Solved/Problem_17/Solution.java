package Solved.Problem_17;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        for(int i = 1; i <= 1000; i++){
            answer += stringify(i).replace(" ", "").length();
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static String stringify(int input){
        if(input == 0) return ""; // if this is "zero" the recursion breaks, and zero is only needed at 0, which is not in the domain of the problem
        int length = (int)Math.log10(input) + 1;
        if(length == 1){
            switch(input){
                case 1:
                return "one";
                case 2:
                return "two";
                case 3:
                return "three";
                case 4:
                return "four";
                case 5:
                return "five";
                case 6:
                return "six";
                case 7:
                return "seven";
                case 8:
                return "eight";
                case 9:
                return "nine";
            }
        }
        if(length == 2){
            switch(input){
                case 10:
                return "ten";
                case 11:
                return "eleven";
                case 12:
                return "twelve";
                case 13:
                return "thirteen";
                case 14:
                return "fourteen";
                case 15:
                return "fifteen";
                case 16:
                return "sixteen";
                case 17:
                return "seventeen";
                case 18:
                return "eighteen";
                case 19:
                return "nineteen";
            }
            switch(input / 10){
                case 0:
                return stringify(input % 10);
                case 2:
                return "twenty " + stringify(input % 10);
                case 3:
                return "thirty " + stringify(input % 10);
                case 4:
                return "forty " + stringify(input % 10);
                case 5:
                return "fifty " + stringify(input % 10);
                case 6:
                return "sixty " + stringify(input % 10);
                case 7:
                return "seventy " + stringify(input % 10);
                case 8:
                return "eighty " + stringify(input % 10);
                case 9:
                return "ninety " + stringify(input % 10);
            }
        }
        if(length == 3){
            if(input % 100 == 0) return stringify(input / 100) + "hundred";
            return stringify(input / 100) + " hundred and " + stringify(input % 100);
        }
        return "one thousand";
    }
}