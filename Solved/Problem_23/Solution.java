package Solved.Problem_23;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args){
        int answer = 0;
        ArrayList<Integer> abundants = new ArrayList<>();
        for(int i = 12; i <= 28123; i++){
            int sum = 0;
            for(int j = 1; j <= i/2; j++){
                // if(j > 3 && sum == 1) continue;
                if(i % j == 0) {
                    sum += j;
                }
            }
            if(sum > i){
                abundants.add(i);
            }
        }
        HashMap<Integer, Boolean> possible = new HashMap<>();
        for(int abun : abundants){
            for(int abun2: abundants){
                possible.put(abun + abun2, true);
            }
        }
        for(int i = 1; i <= 28123; i++){
            if(possible.get(i) == null) answer += i;
        }
        System.out.printf("The answer is: %s", answer);
    }
}