import java.util.TreeMap;

public class code7 {

    public code7() {
    }
    public static void main(String[] args) {
        Test t = new Test();
        TreeMap tm = new TreeMap();
        tm.put("key","String1");
        System.out.println(tm.get("key"));
        tm.put("key","String2");
        System.out.println(tm.get("key"));
    }
}