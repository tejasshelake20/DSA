public class Pattern8 {
    public static void main(String[] args) {
        nStarTriangle(3);
    }
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i = 0; i < n; i++){

            // for " "
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }

            // for *
            for(int j = 1; j <= ((n * 2) - (i * 2) - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
