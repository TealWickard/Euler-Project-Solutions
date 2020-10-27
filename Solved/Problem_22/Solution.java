package Solved.Problem_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        int answer = 0;
        Scanner scan = new Scanner(new File("Solved/Problem_22/p022_names.txt"));
        String[] words = scan.next().split(",");
        LinkedList<String> wordsList = new LinkedList<>();
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].replace("\"", "");
            wordsList.add(words[i]);
        }
        Collections.sort(wordsList);
        for(int i = 0; i < words.length; i++){
            int sum = 0;
            for(char c : words[i].toCharArray()){
                if(c < 65) System.out.println(c);
                sum += (c - 64);
            }
            answer += sum * (wordsList.indexOf(words[i]) + 1);
        }
        System.out.printf("The answer is: %s", answer);
    }
}