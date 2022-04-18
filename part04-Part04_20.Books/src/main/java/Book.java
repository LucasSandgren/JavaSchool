
public class Book {
    private String instanceBook;
    private int instancePages;
    private int instanceYear;
    
    
    public Book(String newBook, int newPages, int newYear){
        this.instanceBook = newBook;
        this.instancePages = newPages;
        this.instanceYear = newYear;
    }

    public String getInstanceBook() {
        return instanceBook;
    }

    public void setInstanceBook(String instanceBook) {
        this.instanceBook = instanceBook;
    }
    public int getInstancePages() {
        return instancePages;
    }

    public void setInstancePages(int instancePages) {
        this.instancePages = instancePages;
    }
    
    public int getInstanceYear() {
        return instanceYear;
    }

    public void setInstanceYear(int instanceYear) {
        this.instanceYear = instanceYear;
    }

    
}
    


