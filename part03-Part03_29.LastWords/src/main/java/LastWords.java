
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            
            String[] parts = userInput.split(" ");
            System.out.println(parts[parts.length-1]);
        }
    }
}
