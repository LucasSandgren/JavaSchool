
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;
        
        while (true) {
            System.out.println("Give numbers:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            sum += number;
            numbers++;
            
            if (number % 2 == 0) {
                even++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        Double average = (double) sum / numbers;
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + (numbers - even));
    }
}
