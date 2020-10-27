package Solved.Problem_37;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        int curr = 23;
        int count = 0;
        while(count < 11){
            int trunc = curr;
            boolean doAdd = true;
            while(trunc > 0){
                if(!isPrime(trunc)){
                    doAdd = false;
                    break;
                }
                trunc /= 10;
            }
            trunc = curr;
            while(trunc > 9){
                if(!isPrime(trunc)){
                    doAdd = false;
                }
                trunc = Integer.parseInt(Integer.toString(trunc).substring(1));
            }
            if(isPrime(trunc) && doAdd){
                answer += curr;
                count++;
            }
            // Digit adjustment (could be prettied up, but it works (mostly) so whatever)
            if(curr % 10 == 7) curr += 2; 
            else curr += 4;
            for(int i = 1; i < 6; i++){
                int div = (int)Math.pow(10, i);
                if (curr < div) break;
                if (curr / div < 10){
                    while((curr / div) % 10 != 2 && (curr / div) % 10 != 3 && (curr / div) % 10 != 5 && (curr / div) % 10 != 7){
                        curr += div;
                    }
                    continue;
                }
                while((curr / div) % 10 != 1 && (curr / div) % 10 != 3 && (curr / div) % 10 != 7  && (curr / div) % 10 != 9){
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