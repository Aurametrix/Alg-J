import java.util.Date;
import java.util.TimeZone;

public class Test {

    public static void main(String[] args) {
        // The default time zone makes no difference when constructing
        // a Date from a milliseconds-since-Unix-epoch value
        Date date = new Date(-14159020000L);

        // Display the instant in three different time zones
        TimeZone.setDefault(TimeZone.getTimeZone("America/Chicago"));
        System.out.println(date);

        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        System.out.println(date);

        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Riyadh"));
        System.out.println(date);

        // Prove that the instant hasn't changed...
        System.out.println(date.getTime());
    }
}
