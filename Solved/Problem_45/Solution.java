package Solved.Problem_45;
public class Solution {
    public static void main(String[] args){
        long tCurr = 286;
        long pCurr = 166;
        long hCurr = 144;
        long tri = tri(tCurr);
        long pent = pent(pCurr);
        long hex = hex(hCurr);
        while(tri != hex){
            if(pent < hex){
                pent = pent(++pCurr);
            } else if(pent > hex){
                hex = hex(++hCurr);
            } else{
                while(tri < hex){
                    tri = tri(++tCurr);
                }
                pent = pent(++pCurr);
            }
        }
        System.out.printf("The answer is: %s", tri);
    }
    public static long tri(long input){
        return (input * (input + 1)) / 2;
    }
    public static long pent(long input){
        return (input * (3 * input - 1)) / 2;
    }
    public static long hex(long input){
        return input * (2 * input - 1);
    }
}