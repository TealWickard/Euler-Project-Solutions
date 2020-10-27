package Solved.Problem_33;
public class Solution {
    public static void main(String[] args){
        int totalNum = 1;
        int totalDen = 1;
        for(int den = 12; den < 100; den++){
            for(int num = 11; num < den; num++){
                if(num % 10 == 0 || den % 10 == 0) continue;
                int d1 = den / 10;
                int d2 = den % 10;
                int n1 = num / 10;
                int n2 = num % 10;
                if(d1 == n1 && d2 * num == n2 * den || d1 == n2 && d2 * num == n1 * den || d2 == n1 && d1 * num == n2 * den || d2 == n2 && d1 * num == n1 * den){
                    totalDen *= den;
                    totalNum *= num;
                }
            }
        }
        for(int i = 2; i < totalDen; i++){
            if(totalNum % i == 0 && totalDen % i == 0){
                totalNum /= i;
                totalDen /= i;
                i--;
            }
        }
        System.out.printf("The answer is: %s", totalDen);
    }
}