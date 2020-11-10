package Solved.Problem_59;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        int answer = 0;
        Scanner scan = new Scanner(new File("Solved/Problem_59/p059_cipher.txt"));
        String[] chars = scan.nextLine().split(",");
        char[] answerChars = new char[3];
        int[] best = new int[3];
        for(int i = 97; i < 97 + 26; i++){
            int[] current = new int[3];
            int curr = 0;
            for(String s : chars){
                int num = Integer.parseInt(s);
                if(curr % 3 == 0) if(Character.isLetter(num ^ i)) current[0]++;
                if(curr % 3 == 1) if(Character.isLetter(num ^ i)) current[1]++;
                if(curr % 3 == 2) if(Character.isLetter(num ^ i)) current[2]++;
                curr++;
            }
            for(int j = 0; j < 3; j++){
                if(current[j] > best[j]){
                    best[j] = current[j];
                    answerChars[j] = (char)i;
                }
            }
        }
        int curr = 0;
        for(String s : chars){
            int num = Integer.parseInt(s);
            if(curr % 3 == 0) {
                System.out.print((char)(num ^ answerChars[0]));
                answer += num ^ answerChars[0];
            }
            if(curr % 3 == 1){
                System.out.print((char)(num ^ answerChars[1]));
                answer += num ^ answerChars[1];
            }
            if(curr % 3 == 2){
                System.out.print((char)(num ^ answerChars[2]));
                answer += num ^ answerChars[2];
            }
            curr++;
        }
        System.out.println(new String(answerChars));
        System.out.printf("The answer is: %s", answer);
    }
}