package Solved.Problem_41;

import java.util.Collections;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args){
        String answer = "";
        LinkedList<String> possiblePrimes = new LinkedList<>();
        possiblePrimes.add("1");
        possiblePrimes.add("3");
        possiblePrimes.add("7");
        while(possiblePrimes.peek().length() != 7){
            String head = possiblePrimes.pop();
            if(!head.contains("1")){
                possiblePrimes.add("1" + head);
            }
            if(!head.contains("2")){
                possiblePrimes.add("2" + head);
            }
            if(!head.contains("3")){
                possiblePrimes.add("3" + head);
            }
            if(!head.contains("4")){
                possiblePrimes.add("4" + head);
            }
            if(!head.contains("5")){
                possiblePrimes.add("5" + head);
            }
            if(!head.contains("6")){
                possiblePrimes.add("6" + head);
            }
            if(!head.contains("7")){
                possiblePrimes.add("7" + head);
            }
        }
        Collections.sort(possiblePrimes);
        for(int i = possiblePrimes.size() - 1; i >= 0; i--){
            if(isPrime(Integer.parseInt(possiblePrimes.get(i)))){
                answer = possiblePrimes.get(i);
                break;
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