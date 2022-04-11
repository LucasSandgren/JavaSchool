
public class Product {
    private String Name;
    private double price;
    private int quantity;
    
    public Product(String initialName, double initialPrice, int initialQuantity) {
    this.Name = initialName;
    this.price = initialPrice;
    this.quantity = initialQuantity;
    }    
    public void printProduct() {
        System.out.println(Name+" "+price+" "+quantity);
        
    }
}
