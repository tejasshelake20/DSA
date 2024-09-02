import java.io.*;

public class BufferReaderClass {
    // Byte(Keyboard Input) to character stream by InputStreamReader & Then Reading Character Stream
    // Using BufferedReader Class of Character Stream
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("You typed: " + br.readLine());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Tejas\\Desktop\\PlacementFinal\\JavaRestart\\Codes\\File Handling\\src\\notes.txt"))) {
            while(br.ready()){
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
