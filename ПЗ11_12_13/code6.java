import java.util.ArrayList;
import java.util.Iterator;

public class code6 {
    public code6() {
    }
    public static void main(String[] args) {
        Test t = new Test();
        ArrayList al = new ArrayList();
        al.add("First element");
        al.add("Second element");
        al.add("Third element");
        Iterator it = al.iterator();
        while(it.hasNext()) {
            System.out.println((String)it.next());
        }
        System.out.println("\n");
        al.add(2,"Insertion");
        it = al.iterator();
        while(it.hasNext()){
            System.out.println((String)it.next());
        }
    }
}