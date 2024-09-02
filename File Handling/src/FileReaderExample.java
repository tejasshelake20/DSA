import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("C:\\Users\\Tejas\\Desktop\\PlacementFinal\\JavaRestart\\Codes\\File Handling\\src\\notes.txt")){

            int letters = fr.read();

            while(fr.ready()){
                System.out.print((char) letters);
                letters = fr.read();
            }

//            isr.close();
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
