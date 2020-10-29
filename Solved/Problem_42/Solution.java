package Solved.Problem_42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        int answer = 0;
        Scanner scan = new Scanner(new File("Solved/Problem_42/p042_words.txt"));
        String[] words = scan.next().split(",");
        scan.close();
        HashMap<Integer, Boolean> isTriangle = new HashMap<>();
        for(int i = 1; i < 100; i++){
            isTriangle.put((i * (i + 1))/2, true);
        }
        for(String s : words){
            int sum = 0;
            for(char c : s.toCharArray()){
                if(c == 34) continue;
                sum += (c - 64);
            }
            if(isTriangle.get(sum) != null)answer++;
        }
        System.out.printf("The answer is: %s", answer);
    }
}