
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(3);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int x = 0;
        while (x<number) {
            System.out.print("*");
            x++;
        } 
        System.out.println("");
    }
    

    public static void printSquare(int size) {
        
        for (int x = 0; x<size;) {
            printStars(size);
            ++x;
        }
    }

    public static void printRectangle(int width, int height) {
        for (int x=0; x<height;){
            printStars(width);
            x++;
        }
    }

    public static void printTriangle(int size) {
        for (int x = 1; x<= size;) {
            printStars(x);
            x++;
        }
    }
}
