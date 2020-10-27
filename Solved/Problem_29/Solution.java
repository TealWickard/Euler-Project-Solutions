package Solved.Problem_29;

import java.math.BigInteger;
import java.util.Collections;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args){
        int answer = 1;
        LinkedList<BigInteger> nums = new LinkedList<>();
        for(int a = 2; a <= 100; a++){
            for(int b = 2; b <= 100; b++){
                nums.add(new BigInteger(Integer.toString(a)).pow(b));
            }
        }
        Collections.sort(nums);
        BigInteger current = nums.remove();
        while(nums.size() > 0){
            BigInteger next = nums.remove();
            if(!current.equals(next)){
                answer++;
            }
            current = next;
        }
        System.out.printf("The answer is: %s", answer);
    }
}