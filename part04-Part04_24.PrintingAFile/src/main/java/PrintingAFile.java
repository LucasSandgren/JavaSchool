
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingAFile {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(Paths.get("data.txt"))){
            while(sc.hasNextLine()){
                String textRead = sc.nextLine();
                System.out.println(textRead);
            }
        } catch (IOException ex) {
            Logger.getLogger(PrintingAFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
