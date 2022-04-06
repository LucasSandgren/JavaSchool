
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int i = Integer.valueOf(scanner.nextLine());
            
            if (i == -1) {
                break;
            } //end of if
            numbers.add(i);
        } //end of while
        
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
