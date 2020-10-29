package Solved.Problem_39;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        int[] perimeters = new int[1001];
        for(int a = 3; a <= 293; a++){
            for(int b = a; b <= 1000; b++){
                double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                if(a + b + c <= 1000){
                    if(c % 1 == 0){
                        perimeters[(int)(a + b + c)]++;
                    }
                }
            }
        }
        int most = 0;
        for(int i = 0; i < perimeters.length; i++){
            if(perimeters[i] > most){
                most = perimeters[i];
                answer = i;
            }
        }
        System.out.printf("The answer is: %s", answer);
    }
}