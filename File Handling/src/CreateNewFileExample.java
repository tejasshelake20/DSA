import java.io.File;
import java.io.IOException;

public class CreateNewFileExample {
    public static void main(String[] args) {
        try {
            File fo = new File("src\\newCreateFile.txt");
            fo.createNewFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
