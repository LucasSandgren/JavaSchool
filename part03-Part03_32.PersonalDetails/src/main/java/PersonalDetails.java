
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, nameLength, temp = 0; String name = "";
        
        while(true){
            String input=scanner.nextLine();
            if(input.equals("")){
                break;
            }
        
        String[]column= input.split(",");
        sum += Integer.valueOf(column[1]);
        count++;
        nameLength = column[0].length();
       
        if(temp < nameLength){
            temp = nameLength;
            name = column[0];
            
            System.out.println("Longest: " + name);
            System.out.println("Avg " + (1.0 * (sum/count)));
        }
        }
    }
}
