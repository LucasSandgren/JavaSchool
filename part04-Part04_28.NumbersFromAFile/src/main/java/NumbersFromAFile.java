
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {
    private static int count;
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // Create ArrayList to check ranges against
        Scanner SC = new Scanner(System.in);
        
        System.out.println("File? ");
        String file = SC.nextLine(); // File input to search for
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(SC.nextLine()); // Lower number input
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(SC.nextLine()); // Upper number input
    
    try(Scanner fileScan = new Scanner(Paths.get(file))){
            while(fileScan.hasNextLine()){
                list.add(fileScan.nextLine()); // add next line to ArrayList line
            }
        }catch (IOException ex) {
            System.out.println("Reading the file" + file + "failed");
        }
        for (String counter : list){
            int numberRange=Integer.valueOf(counter); // range between upper and lower bound
            if(numberRange >=lowerBound && numberRange <=upperBound){
                count++;
        }else{
            continue;
            }
        } 
        System.out.println("Numbers: " + count);
    }
}

        
       
    
    



