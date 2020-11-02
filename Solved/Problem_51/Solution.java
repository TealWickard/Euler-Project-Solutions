package Solved.Problem_51;

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args){
        String answer = "";
        LinkedList<String> toCheck = new LinkedList<>();
        for(int i = 0; i < 100; i++){
            String toAdd = Integer.toString(i);
            if(i < 10) toAdd = "0" + toAdd;
            toCheck.add(toAdd);
        }
        while(toCheck.peek().length() == 2){
            String next = toCheck.pop();
            toCheck.add("XXX" + next);
            toCheck.add("XX" + next + "X");
            toCheck.add("X" + next + "XX");
            toCheck.add(next + "XXX");
            char a = next.charAt(0);
            char b = next.charAt(1);
            toCheck.add("X" + a + "X" + b + "X");
            toCheck.add(a + "XX" + b + "X");
            toCheck.add("X" + a + "XX" + b);
            toCheck.add(a + "XXX" + b);
            toCheck.add(a + "X" + b + "XX");
            toCheck.add("XX" + a + "X" + b);
        }
        while(toCheck.peek().length() == 5){
            String next = toCheck.pop();
            toCheck.add(next + "1");
            toCheck.add(next + "3");
            toCheck.add(next + "7");
            toCheck.add(next + "9");
        }
        while(!toCheck.isEmpty()){
            String test = toCheck.pop();
            int failed = 0;
            int i = 0;
            while(true){
                if(i == 0 && test.charAt(i) == 'X') {
                    failed++;
                } else if(!isPrime(Integer.parseInt(test.replace('X', (char) (i + 48))))){
                    failed++;
                    if(failed > 2) break;
                }
                i++;
                if(i == 10){
                    for(int j = 0; j < 10; j++){
                        if(j == 0 && test.charAt(0) == 'X') continue;
                        if(isPrime(Integer.parseInt(test.replace('X', (char) (j + 48))))){
                            answer = test.replace('X', (char) (j + 48));
                            break;
                        }
                    }
                    break;
                }
            }
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}