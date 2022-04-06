
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            } //end if

            numbers.add(number);
        } //end while loop

        System.out.println("From where?");
        int start = scanner.nextInt(); // start point
        System.out.println("To where?");
        int end = scanner.nextInt(); // end point
        
        for (int i = start; i <= end; i++) { // i = start, less than end i++
            System.out.println(numbers.get(i));
        }
    }
}
