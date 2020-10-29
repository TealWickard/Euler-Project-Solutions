package Solved.Problem_43;

import java.math.BigInteger;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args){
        BigInteger answer = new BigInteger("0");
        LinkedList<String> possiblyDivis = new LinkedList<>();
        long i = 17;
        while(i < 1000){
            String toAdd = Long.toString(i);
            if(toAdd.length() == 2) toAdd = "0" + toAdd;
            if(toAdd.charAt(0) != toAdd.charAt(1) && toAdd.charAt(0) != toAdd.charAt(2) && toAdd.charAt(1) != toAdd.charAt(2)){
                possiblyDivis.add(toAdd);
            }
            i += 17;
        }
        while(possiblyDivis.peek().length() != 10){
            String head = possiblyDivis.pop();
            if(!head.contains("0")){
                possiblyDivis.add("0" + head);
            }
            if(!head.contains("1")){
                possiblyDivis.add("1" + head);
            }
            if(!head.contains("2")){
                possiblyDivis.add("2" + head);
            }
            if(!head.contains("3")){
                possiblyDivis.add("3" + head);
            }
            if(!head.contains("4")){
                possiblyDivis.add("4" + head);
            }
            if(!head.contains("5")){
                possiblyDivis.add("5" + head);
            }
            if(!head.contains("6")){
                possiblyDivis.add("6" + head);
            }
            if(!head.contains("7")){
                possiblyDivis.add("7" + head);
            }
            if(!head.contains("8")){
                possiblyDivis.add("8" + head);
            }
            if(!head.contains("9")){
                possiblyDivis.add("9" + head);
            }
        }
        for(String str : possiblyDivis){
            if(Integer.parseInt(str.substring(6, 9)) % 13 == 0 && Integer.parseInt(str.substring(5, 8)) % 11 == 0 && Integer.parseInt(str.substring(4, 7)) % 7 == 0 && Integer.parseInt(str.substring(3, 6)) % 5 == 0 && Integer.parseInt(str.substring(2, 5)) % 3 == 0 && Integer.parseInt(str.substring(1, 4)) % 2 == 0){
                answer = answer.add(new BigInteger(str));
            }
        }
        System.out.printf("The answer is: %s", answer);
    }
}