import java.util.Calendar;

public class TestClass {

    static Calendar calendar = Calendar.getInstance();
    public static void main(String[] args){


        String now = String.valueOf(calendar.getTime());
        System.out.println(now);
    }
}
