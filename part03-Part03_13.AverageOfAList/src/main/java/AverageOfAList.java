
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int totalNumbers = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        for (int i : list) {
            sum += i;
            totalNumbers++;
        }
        System.out.println("Average: " + 1.0 * sum/totalNumbers);
    }
}
