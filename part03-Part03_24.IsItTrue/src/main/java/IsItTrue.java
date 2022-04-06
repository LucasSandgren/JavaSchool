
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String text = "true"; // String to search for
        String input = scanner.nextLine();
       
        if (input.equals("true")){ //compare to string
            System.out.println("You got it right!");
        } else { //if equals is wrong
            System.out.println("Try again!");
        }
    }
}
