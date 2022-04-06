
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayList;
        
        while (true) {
            String userInput = scanner.nextLine();
                if(userInput.equals("")) {
                    break;
        }
        arrayList = userInput.split(" ");
        
        for (String i : arrayList) {
            System.out.println(i);
        }
        }   
    }
}
