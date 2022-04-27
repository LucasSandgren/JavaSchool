
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner SC = new Scanner(System.in);
        String file = SC.nextLine();
        
        try (Scanner fileScan = new Scanner (Paths.get(file))){
            while(fileScan.hasNextLine()){
            String line = fileScan.nextLine();
            
            String[]parts = line.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            System.out.println(name + ", " + age + " years");
            }

    }   
    }
}
