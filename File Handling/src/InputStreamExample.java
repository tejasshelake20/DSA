import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamExample {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.print("Enter some letters: ");
            int letters = isr.read();
            while(isr.ready()){
                System.out.println((char) letters);
                letters = isr.read();
            }

//            isr.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
