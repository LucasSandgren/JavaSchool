
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Input: ");
            String input = sc.nextLine();
            if(input.equals("end")){
                break;
            }
        
        int number = Integer.valueOf(input);
            System.out.println(number*number*number);   
        }
         
    }
}
