package Solved.Problem_44;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args){
        int answer = Integer.MAX_VALUE;
        HashMap<Integer, Boolean> pentagonals = new HashMap<>();
        for(int i = 1; i < 10000; i++){
            pentagonals.put(pentagonalize(i), true); 
        }
        for(int i = 1; i < 10000; i++){
            for(int j = i; j < 10000; j++){
                if(pentagonals.containsKey(pentagonalize(i) + pentagonalize(j)) && pentagonals.containsKey(pentagonalize(j) - pentagonalize(i))){
                    if(pentagonalize(j) - pentagonalize(i) < answer){
                        answer = pentagonalize(j) - pentagonalize(i);
                    }
                }
            }
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static int pentagonalize(int input){
        return (input * (3 * input - 1)) / 2;
    }
}