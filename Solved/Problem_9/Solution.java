package Solved.Problem_9;
public class Solution {
    public static void main(String[] args){
        int a = 1;
        int b = 1;
        int c = 998;
        while(true){
            b = a;
            while(b < c){
                c = 1000 - a - b;
                if(a*a + b*b == c*c){
                    System.out.printf("The answer is: %s", a * b * c);
                    return;
                }
                b++;
            }
            a++;
        }
    }
}