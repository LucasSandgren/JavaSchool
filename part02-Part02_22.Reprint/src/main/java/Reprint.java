
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("How many times?");
        int input = Integer.valueOf(scanner.nextLine());
     
        while (count < input) {
            printText();
            count++;
        }
    
    }
    
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
