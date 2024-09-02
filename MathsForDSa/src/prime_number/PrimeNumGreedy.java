package prime_number;

public class PrimeNumGreedy {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(isPrime(13));
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c < n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
