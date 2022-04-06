
public class YourFirstAccount {

    public static void main(String[] args) {
        
        
        Account accountOne = new Account("Lucas account", 100.00);
        System.out.println("Initial state");
        System.out.println(accountOne);
        
        accountOne.deposit(20);
        
        System.out.println("The balance of Lucas account is now: " + accountOne);
            
    }
}
