
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> listMain=new ArrayList<>();
        listMain.add("First");
        listMain.add("Second");
        listMain.add("Third");
        System.out.println(listMain);
        
    }
    
    public static void removeLast(ArrayList<String>listOne){
        if(listOne.isEmpty()) {
            return;
        }
        listOne.remove(listOne.size()-1);
    }
}
