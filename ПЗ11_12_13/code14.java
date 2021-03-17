import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import java.util.ResourceBundle;

public interface code14 {
    public String getBehavior();
    public String getCapital();
}


class Using {
    public Using() {
    }

    public static void main(String[] args) {
        Using u = new Using();
        ResourceBundle rb =
                ResourceBundle.getBundle("lecture.MyResourceBundle", Locale.getDefault());
        System.out.println((String) rb.getObject("Bundle description"));
        code14 be = (code14) rb.getObject("Behavior");
        System.out.println(be.getBehavior());
        System.out.println(be.getCapital());
        rb = ResourceBundle.getBundle("lecture.MyResourceBundle", new Locale("en", "EN"));
        System.out.println((String) rb.getObject("Bundle description"));
        be = (code14) rb.getObject("Behavior");
        System.out.println(be.getBehavior());
        System.out.println(be.getCapital());
    }
}