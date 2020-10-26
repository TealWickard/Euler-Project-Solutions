package Solved.Problem_18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Solved/Problem_18/triangle.txt"));
        int[][] nums = new int[15][15];
        for(int i = 0; i < nums.length; i++){
            String[] numsInLine = scan.nextLine().split(" ");
            for(int j = 0; j < i + 1; j++){
                nums[i][j] = Integer.parseInt(numsInLine[j]);
            }
        }
        scan.close();
        for(int i = 13; i > -1; i--){
            for(int j = 0; j < i + 1; j++){
                if(nums[i + 1][j] > nums[i + 1][j + 1]){
                    nums[i][j] += nums[i + 1][j];
                } else {
                    nums[i][j] += nums[i + 1][j + 1];
                }
            }
        }
        System.out.printf("The answer is: %s", nums[0][0]);
    }
}