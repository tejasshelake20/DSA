import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        // create a file
        try{
            File fo = new File("src\\newFile");
            fo.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        // write in the file
        try(BufferedWriter fo = new BufferedWriter(new FileWriter("C:\\Users\\Tejas\\Desktop\\PlacementFinal\\JavaRestart\\Codes\\File Handling\\src\\newFile.txt"))){
            fo.write("This is an example file for operations in file handling..");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        // read the file in the console
        // a. By readLine()
        try(BufferedReader fo1 = new BufferedReader(new FileReader("C:\\Users\\Tejas\\Desktop\\PlacementFinal\\JavaRestart\\Codes\\File Handling\\src\\newFile.txt"))){
            while(fo1.ready()){
                System.out.println(fo1.readLine());
            }
        }catch (IOException e){
            e.getMessage();
        }

        // b. By Character Reading
        try(BufferedReader fo2 = new BufferedReader(new FileReader("C:\\Users\\Tejas\\Desktop\\PlacementFinal\\JavaRestart\\Codes\\File Handling\\src\\newFile.txt"))){
            int letters = fo2.read();
            while(fo2.ready()){
                System.out.println((char) letters);
                letters = fo2.read();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        // create and delete any random file
        try{
            File fo = new File("C:\\Users\\Tejas\\Desktop\\PlacementFinal\\JavaRestart\\Codes\\File Handling\\src\\random.txt");
            fo.createNewFile();
            if(fo.delete()){
                System.out.println(fo.getName());
            }
            }catch(IOException e){
            System.out.println(e.getMessage());
        }

        // delete an existing file
        try{
            File fo = new File("C:\\Users\\Tejas\\Desktop\\PlacementFinal\\JavaRestart\\Codes\\File Handling\\src\\asach.txt");
            if(fo.delete()){
                System.out.println(fo.getName());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }

}
