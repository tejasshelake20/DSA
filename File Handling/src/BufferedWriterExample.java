import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Tejas\\Desktop\\PlacementFinal\\JavaRestart\\Codes\\File Handling\\src\\notes.txt",true))){
            bw.write("\nHare Krishna..!\nHare Krishna..!");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
