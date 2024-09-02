import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("C:\\Users\\Tejas\\Desktop\\PlacementFinal\\JavaRestart\\Codes\\File Handling\\src\\notes.txt",true)){
            fw.write("\nMaking some changes in my file..");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
