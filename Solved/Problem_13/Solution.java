package Solved.Problem_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        BigInteger answer = new BigInteger("0");
        Scanner scan = new Scanner(new File("Solved/Problem_13/numbers.txt"));
        while(scan.hasNext()){
            answer = answer.add(new BigInteger(scan.nextLine()));
        }
        scan.close();
        System.out.printf("The answer is: %s", answer.toString().substring(0, 10));
    }
}