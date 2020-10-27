package Solved.Problem_21;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args){
        int answer = 0;
        HashMap<Integer, Integer> divisors = new HashMap<>();
        for(int i = 2; i <= 10000; i++){
            int sum = 0;
            for(int j = 1; j <= i/2; j++){
                if(i % j == 0) sum += j;
            }
            divisors.put(i, sum);
        }
        for(int key : divisors.keySet()){
            int div = divisors.get(key);
            if(!divisors.containsKey(div) || key == div) continue;
            if(key == divisors.get(div)){
                answer += key;
            }
        }
        System.out.printf("The answer is: %s", answer);
    }
}