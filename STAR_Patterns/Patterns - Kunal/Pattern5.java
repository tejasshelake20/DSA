package Pattern;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        for(int i=1;i<2*n;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
            }
            if(i>n){
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}