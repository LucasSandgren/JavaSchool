
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int points=scan.nextInt();
        if(points>100){
            System.out.println("Incredible!");
        }
        if(points<=100 && points>=90){
            System.out.println("Grade:5");
        }
        if(points<=89 && points>=80){
            System.out.println("Grade:4");
        }
        if(points<=79 && points>=70){
            System.out.println("Grade:3");
        }
        if(points<=69 && points>=60){
            System.out.println("Grade:2");
        }
        if(points<=59 && points>=50){
            System.out.println("Grade:1");
        }
        if(points<=49 && points>=0){
            System.out.println("Failed");
        }
        if(points<0){
            System.out.println("impossible!");
        
        
        }
    }
}