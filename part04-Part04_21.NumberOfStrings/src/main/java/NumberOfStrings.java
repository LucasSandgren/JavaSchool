
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int number=0;
        while(true){
            String inputCount = sc.nextLine();
            number++;
            if(inputCount.equals("end")){
                number--;
                break;
            }
            
        }
        System.out.println(number);
    }
}
