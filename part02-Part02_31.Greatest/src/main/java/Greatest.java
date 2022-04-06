
public class Greatest {
    
    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
    
    public static int greatest(int number1, int number2, int number3) {
        int a = number1;
        int b = number2;
        int c = number3;
        
        if (a>=b & a>=c) {
            return a;
        } else if (b>=a & b>=c) {
            return b;
        } else  {
            return c;
        }   
    }
}
   
