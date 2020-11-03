package Solved.Problem_54;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        int answer = 0;
        Scanner scan = new Scanner(new File("Solved/Problem_54/p054_poker.txt"));
        while(scan.hasNextLine()){
            String nextLine = scan.nextLine();
            String[] hand1 = nextLine.substring(0, 14).split(" ");
            String[] hand2 = nextLine.substring(15).split(" ");
            int[] hand1score = evaluate(hand1);
            int[] hand2score = evaluate(hand2);
            compare:
            for(int i = 0; i < hand1score.length; i++){
                if(hand1score[i] > hand2score[i]){
                    answer++;
                    break compare;
                }
                if(hand1score[i] < hand2score[i]){
                    break compare;
                }
            }
        }
        System.out.printf("The answer is: %s", answer);
    }
    public static int[] evaluate(String[] hand){
        /*
        0: high card, 5 kickers
        1: pair, 1 pair, 3 kickers
        2: 2 pair, 1 high pair, 1 low pair, 1 kicker
        3: 3 of a kind, 3 of a kind, 2 kickers
        4: straight, highest
        5: flush, 5 kickers
        6: full house, 3 of a kind, 1 pair
        7: 4 of a kind, 4 of a kind, 1 kicker
        8: straight flush, highest 
        */
        int[] toReturn = new int[6];
        int[] quans = new int[15];
        for(String card : hand){
            quans[value(card)]++;
        }
        int pairs = 0;
        int trips = 0;
        int quads = 0;
        int a = 0;
        int b = 0;
        boolean isStraight = true;
        boolean isFlush = true;
        LinkedList<Integer> straight = findKickers(-1, -1, hand);
        for(int i = 0; i < 4; i++){
            if(straight.get(i) != straight.get(i + 1) - 1) isStraight = false;
        }
        if(straight.get(0) == 2 && straight.get(1) == 3 && straight.get(2) == 4 && straight.get(3) == 5 && straight.get(4) == 14) isStraight = true;
        char suit = hand[0].charAt(1);
        for(String card : hand){
            if(card.charAt(1) != suit) isFlush = false;
        }
        if(isFlush){
            if(isStraight){
                toReturn[0] = 8;
                if(straight.getLast() == 14 && straight.peek() == 2) toReturn[1] = 5;
                else toReturn[1] = straight.getLast();
                return toReturn;
            }
            toReturn[0] = 5;
            for(int i = 0; i < 5; i++){
                toReturn[i + 1] = straight.get(4 - i);
            }
            return toReturn;
        }
        if(isStraight){
            System.out.println(hand[0] + " " + hand[1] + " " + hand[2]);
            toReturn[0] = 4;
            if(straight.getLast() == 14 && straight.peek() == 2) toReturn[1] = 5;
            else toReturn[1] = straight.getLast();
            return toReturn;
        }
        for(int i = 0; i < quans.length; i++){
            if(quans[i] > 1){
                if(a == 0) a = i;
                else b = i;
            }
            if(quans[i] == 2) pairs++;
            if(quans[i] == 3) trips++;
            if(quans[i] == 4) quads++;
        }
        if(quads == 1){
            toReturn[0] = 7;
            toReturn[1] = a;
            toReturn[2] = findKickers(a, -1, hand).peek();
            return toReturn;
        }
        if(trips == 1 && pairs == 1){
            if(quans[b] == 3){
                int buffer = b;
                b = a;
                a = buffer;
            }
            toReturn[0] = 6;
            toReturn[1] = a;
            toReturn[2] = b;
            return toReturn;
        }
        if(trips == 1){
            LinkedList<Integer> kickers = findKickers(a, -1, hand);
            toReturn[0] = 3;
            toReturn[1] = a;
            toReturn[2] = kickers.get(1);
            toReturn[3] = kickers.get(0);
            return toReturn;
        }
        if(pairs == 2){
            toReturn[0] = 2;
            if(a < b){
                int buffer = b;
                b = a;
                a = buffer;
            }
            toReturn[1] = a;
            toReturn[2] = b;
            toReturn[3] = findKickers(a, b, hand).peek();
            return toReturn;
        }
        if(pairs == 1){
            toReturn[0] = 1;
            toReturn[1] = a;
            LinkedList<Integer> kickers = findKickers(a, -1, hand);
            toReturn[2] = kickers.get(2);
            toReturn[3] = kickers.get(1);
            toReturn[4] = kickers.get(0);
            return toReturn;
        }
        toReturn[0] = 0;
        for(int i = 0; i < 5; i++){
            toReturn[i + 1] = straight.get(4 - i);
        }
        return toReturn;
    }
    public static LinkedList<Integer> findKickers(int ignore1, int ignore2, String[] hand){
        LinkedList<Integer> kickers = new LinkedList<>();
        for(String card : hand){
            if(value(card) != ignore1 && value(card) != ignore2){
                kickers.add(value(card));
            }
        }
        Collections.sort(kickers);
        return kickers;
    }
    public static int value(String card){
        switch(card.charAt(0)){
            case '2':
            return 2;
            case '3':
            return 3;
            case '4':
            return 4;
            case '5':
            return 5;
            case '6':
            return 6;
            case '7':
            return 7;
            case '8':
            return 8;
            case '9':
            return 9;
            case 'A':
            return 14;
            case 'K':
            return 13;
            case 'Q':
            return 12;
            case 'J':
            return 11;
            case 'T':
            return 10;
        }
        return -1;
    }
}