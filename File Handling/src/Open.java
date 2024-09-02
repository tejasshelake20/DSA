import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.format.DecimalStyle;

public class Open {
    public static void main(String[] args) throws IOException, URISyntaxException {
        File fo = new File("C:\\Users\\Tejas\\Desktop\\Resume\\Resume_Tejas_Shelake_BE_2024.pdf");
        Desktop.getDesktop().open(fo);

        File go = new File("src\\newFile.txt");
        Desktop.getDesktop().open(go);

        URI ur = new URI("https://linktr.ee/tejasshelake");
        Desktop.getDesktop().browse(ur);
    }
}
