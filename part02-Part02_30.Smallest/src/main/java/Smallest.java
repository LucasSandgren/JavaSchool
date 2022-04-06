
public class Smallest {

    public static int smallest(int number1, int number2) {
        int a = number1;
        int b = number2;
        if (a>b) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
