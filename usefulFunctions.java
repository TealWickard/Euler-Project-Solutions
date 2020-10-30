import java.util.ArrayList;

// Functions I have made that I might need again at some point
public class usefulFunctions {
    public static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static boolean isPrime(int test, ArrayList<Integer> primes){
        int curr = 0;
        int prime = primes.get(curr);
        while(prime <= Math.sqrt(test)){
            if(test % prime == 0) return false;
            curr++;
            prime = primes.get(curr);
        }
        return true;
    }
}
