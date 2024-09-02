package Pattern;

public class Pattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }

    static void pattern28(int n){
        int spaces = 0;
        for(int row = 1; row < 2 * n; row++){
            if(row<=n){
                for(int j=1;j<=n - row;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=row;j++){
                    System.out.print("* ");
                }
            }
            if(row>n){
                for(int j=n+1;j<=row;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*n - row;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
