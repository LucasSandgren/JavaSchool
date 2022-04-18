import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        
        while(true){
            System.out.println("Title: ");
            String bookTitle = scanner.nextLine();
                if(bookTitle.isEmpty()){
                    break;
            }
            System.out.println("Pages: ");
                int bookPages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
                int pubYear = Integer.valueOf(scanner.nextLine());
                
                bookList.add(new Book (bookTitle, bookPages, pubYear));
        } //end of while statement
        
        System.out.println("What information will be printed?");
            String whatToPrint = scanner.nextLine();
            
        for (Book book : bookList){
            if(whatToPrint.equals("everything")){
                System.out.println(book.getInstanceBook() + ", " + book.getInstancePages() + " pages, " + book.getInstanceYear());
            }
            else if(whatToPrint.equals("name")){
                System.out.println(book.getInstanceBook());
            }
            
        }
    }
}

