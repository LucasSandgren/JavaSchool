
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String user1="alex";
        String user2="emma";
        String password1="sunshine";
        String password2="haskell";
        
        System.out.println("Enter username:");
        String userInput=scanner.nextLine();
        System.out.println("Enter password:");
        String userPassword=scanner.nextLine();
        
        if (userInput.equals("alex") && userPassword.equals("sunshine")) {
            System.out.println("You have succesfully logged in!");
            
        }
        if (userInput.equals("emma") && userPassword.equals("haskell")) {
            System.out.println("You have succesfully logged in!");
        } 
        if (!userInput.equals("alex") && !userInput.equals("emma")) {
            System.out.println("Incorrect username or password!");
        }
    }
}
