package Solved.Problem_3;
import java.math.BigInteger;
public class Solution {
    public static void main(String[] args){
        BigInteger answer = new BigInteger("600851475143");
        BigInteger curr = new BigInteger("1");
        while(curr.compareTo(answer.sqrt()) == -1 || curr.compareTo(answer.sqrt()) == 0){
            if(answer.divideAndRemainder(curr)[1].equals(new BigInteger("0"))){
                answer = answer.divide(curr);
            }
            curr = curr.add(new BigInteger("1"));
        }
        System.out.printf("The answer is: %s", answer);
    }
}