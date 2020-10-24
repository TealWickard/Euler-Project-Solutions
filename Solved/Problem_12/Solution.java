package Solved.Problem_12;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args){
        int answer = 1;
        int curr = 2;
        while(true){
            if(countDiv(answer) > 500) break;
            answer += curr++;
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static int countDiv(int input){
        HashMap<Integer, Integer> divisorCounts = new HashMap<Integer, Integer>();
        for(int i = 2; i <= input; i++){
            if(input % i == 0){
                if(divisorCounts.keySet().contains(i)){
                    divisorCounts.put(i, divisorCounts.get(i) + 1);
                } else {
                    divisorCounts.put(i, 1);
                }
                input /= i;
                i--;
            }
        }
        int count = 1;
        for(int i : divisorCounts.keySet()){
            count *= (divisorCounts.get(i) + 1);
        }
        return count;
    }
}