package Solved.Problem_32;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){
        int answer = 0;
        ArrayList<Integer> products = new ArrayList<>();
        for(int i = 2; i < 9; i++){
            for(int j = 3; j <= 10000/i; j++){
                if(arePandigital(i, j, i * j)) if(!products.contains(i * j)) products.add(i * j);
            }
            if(i == 4) i++;
        }
        for(int i = 12; i < 100; i++){
            for(int j = 100; j <= 1000; j++){
                if(arePandigital(i, j, i * j)) if(!products.contains(i * j)) products.add(i * j);
            }
        }
        for(int i : products) answer += i;
        System.out.printf("The answer is: %s", answer);
    }
    public static boolean arePandigital(int a, int b, int c){
        String all = Integer.toString(a) + Integer.toString(b) + Integer.toString(c);
        return all.length() == 9 && all.contains("1") && all.contains("2") && all.contains("3") && all.contains("4") && all.contains("5") && all.contains("6") && all.contains("7") && all.contains("8") && all.contains("9");
    }
}