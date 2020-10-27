package Solved.Problem_24;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){
        String answer = "";
        int remainder = 999999; // Not 1 million because we want to end on 1. This could be set to 1m, but later code would have to change, and it's cleaner this way
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            nums.add(i); // Setting the array to be {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
        }
        int toFac = 9; // The amount of digits that will be permuting. Starts as 9 because it's the largest int N such that N! < 999999
        while(toFac >= 0){
            int fac = factorial(toFac); // The total of permutations
            int coeff = 0; // For each round of permutations, the next remaining digit will be chosen
            while(++coeff * fac <= remainder); // Find the coeff that will surpass 999999
            coeff--; // Go back one, so we have the highest coeff before 999999
            remainder -= coeff * fac; // Adjust the remainder, since we have solved the current digit
            toFac--; // Go to the next digit
            answer += nums.get(coeff); // Add the correct digit to the final number
            nums.remove(coeff); // Remove the digit from possible digits, since we only use each one once
        }
        System.out.printf("The answer is: %s", answer);
    }

    // Quick and dirty factorial function. Obviously won't work for larger numbers, as the 2b cap will be hit very quickly
    public static int factorial(int i){
        if(i < 2) return 1;
        return i * factorial(i - 1);
    }
}