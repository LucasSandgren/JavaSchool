
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, n = 0;
        
        while (true){
            String userInput=scanner.nextLine();
            if(userInput.equals("")){
            break;
        }
        String[] column = userInput.split(",");
        age = Integer.valueOf(column[1]);
        if (age>n) {
            n = age;
        }
            
        }
        System.out.println("Age of the oldest: " + n);
    }
}
