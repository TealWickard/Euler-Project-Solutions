package Solved.Problem_35;
public class Solution {
    public static void main(String[] args){
        int answer = 13;
        int curr = 101;
        while(curr < 1000000){
            String sCurr = Integer.toString(curr);
            boolean doAdd = true;
            for(int i = 0; i < sCurr.length(); i++){
                if(!isPrime(Integer.parseInt(sCurr))){
                    doAdd = false;
                    break;
                }
                // Rotate string
                sCurr = sCurr.substring(1) + sCurr.charAt(0);
            }
            if(doAdd){
                answer++;
            }

            // Code to ensure 1, 3, 7, 9 digits exclusively
            curr += 2;
            if(curr % 5 == 0) curr += 2;
            for(int i = 1; i < 6; i++){
                int div = (int)Math.pow(10, i);
                if (curr < div) break;
                while((curr / div) % 10 != 1 && (curr / div) % 10 != 3 && (curr / div) % 10 != 7 && (curr / div) % 10 != 9){
                    curr += div;
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