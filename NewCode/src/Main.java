import java.util.Scanner;
import java.lang.Throwable;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        try{
            int k = 2/n;
            System.out.println(k);
        }
        catch (Throwable e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Exit");
        }
    }
}