package Solved.Problem_31;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        for(int x0 = 0; x0 <= 2; x0++){
            for(int x1 = 0; x1 <= 4; x1++){
                for(int x2 = 0; x2 <= 10; x2++){
                    for(int x3 = 0; x3 <= 20; x3++){
                        for(int x4 = 0; x4 <= 40; x4++){
                            for(int x5 = 0; x5 <= 100; x5++){
                                for(int x6 = 0; x6 <= 200; x6++){
                                    if(100 * x0 + 50 * x1 + 20 * x2 + 10 * x3 + 5 * x4 + 2 * x5 + x6 == 200) answer++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("The answer is: %s", answer + 1);
    }
}