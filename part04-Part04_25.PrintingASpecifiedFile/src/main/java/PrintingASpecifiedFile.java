import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingASpecifiedFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String fileName;
        System.out.println("Which file should have its contents printed?");
        fileName = scanner.nextLine();
        findFile(fileName);    
    }    
    
    public static void findFile(String fileName) {
        try (Scanner SC = new Scanner(Paths.get("fileName"))){
            while(SC.hasNextLine()){
                String textRead = SC.nextLine();
                System.out.println(textRead);
            }
        } catch (IOException ex) {
            Logger.getLogger(PrintingASpecifiedFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
