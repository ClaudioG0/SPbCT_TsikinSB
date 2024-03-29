import java.text.SimpleDateFormat;
import java.util.Calendar;

public class code2 {

    public code2() {
    }
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        cal.set(Calendar.HOUR_OF_DAY,19);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,00);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
        cal.add(Calendar.SECOND,75);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
        cal.add(Calendar.MONTH,1);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
    }
}