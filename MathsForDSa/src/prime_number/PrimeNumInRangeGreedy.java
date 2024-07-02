package prime_number;

public class PrimeNumInRangeGreedy {
    public static void main(String[] args) {
        int s = 7;
        int e =37;
        primeInRange(s,e);;
    }

    static void primeInRange(int s, int e){
        for(int i=s + 1;i<e;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c*c < n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
