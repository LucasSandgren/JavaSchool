
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guve a number: ");
        int input=scan.nextInt();
        if(input>0){
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is not positive.");
        }
        
    }
}
