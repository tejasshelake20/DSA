import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File example = new File("sr\\eample2.txt");
        example.createNewFile();

        FileWriter fw = new FileWriter("src\\example4.txt");
        fw.write("This is a example text  1,,,,");
        fw.close();

        Scanner myReader = new Scanner(example);

        while(myReader.hasNextLine()){
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
//
        example.delete();
        myReader.close();




    }
}
