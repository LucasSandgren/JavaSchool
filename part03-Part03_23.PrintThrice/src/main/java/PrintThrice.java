
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word:");
        String answer = scanner.nextLine();
        System.out.print(answer+answer+answer);

    }
}
