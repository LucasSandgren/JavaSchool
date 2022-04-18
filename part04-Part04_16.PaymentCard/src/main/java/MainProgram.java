import java.util.Scanner;
public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        PaymentCard paulsCard = new PaymentCard(20); // Creates Pauls card
        PaymentCard mattsCard = new PaymentCard(30); // Creates Matts card
        
        paulsCard.eatHeartily(); // Paul eats the expensive meal
        mattsCard.eatAffordably(); // Matt eats the cheap meal
        
        System.out.println("Paul: The card has a balance of " + paulsCard + " euros");
        System.out.println("Matt: The card has a balance of " + mattsCard + " euros");
        
        paulsCard.addMoney(20); //add 20 to Pauls card
        mattsCard.eatHeartily();
        
        System.out.println("Paul: The card has a balance of " + paulsCard + " euros"); // Prints current balance
        System.out.println("Matt: The card has a balance of " + mattsCard + " euros");
        
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        
        mattsCard.addMoney(50);
        
        System.out.println("Paul: The card has a balance of " + paulsCard + " euros"); // Prints current balance
        System.out.println("Matt: The card has a balance of " + mattsCard + " euros");
        
    }
}
