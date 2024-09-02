import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterExample {
    public static void main(String[] args) {
//        OutputStream os = System.out;
//        os.write(😉); // Illegal character --> Range exceeded

        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("Hello World");
            osw.write(10);
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char[] arr = "Hello new array..".toCharArray();
            osw.write(arr);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
