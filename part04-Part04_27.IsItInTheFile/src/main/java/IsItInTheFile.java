
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IsItInTheFile {

    public static void main(String[] args)  {
        Boolean isFound = false;
        Scanner scanner = new Scanner(System.in);
        String fileScanSearch = "";
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try(Scanner fileScan = new Scanner(Paths.get(file))){
            while(fileScan.hasNextLine()){
                fileScanSearch = fileScan.nextLine();
                if (searchedFor.equals(fileScanSearch)){
                    isFound = true;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(IsItInTheFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Reading the file" + file + "failed");
        }
        if(isFound){
            System.out.println("Found!");
        }else{
            System.out.println("Not found!");
        }
    }
}


