package Pattern;

public class pattern3 {
    public static void main(String[] args) {
        pattern3(4);
    }

    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
