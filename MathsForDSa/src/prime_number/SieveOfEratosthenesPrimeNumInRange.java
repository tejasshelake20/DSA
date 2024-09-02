package prime_number;

// Sieve of Eratosthenes
public class SieveOfEratosthenesPrimeNumInRange {
    public static void main(String[] args) {
        int s = 11;
        int e = 43;
        boolean[] arr = new boolean[e+1];
        primeRange(s,e,arr);
    }

    static void primeRange(int s, int e, boolean[] arr){

        for(int i = 2; i * i <= e; i++){
            if(!arr[i]){
                for(int j = i * 2; j <= e; j += i){
                    arr[j] = true;
                }
            }
        }
        for(int i=s;i<=e;i++){
            if(!arr[i]){
                System.out.print(i + " ");
            }
        }
    }
}
