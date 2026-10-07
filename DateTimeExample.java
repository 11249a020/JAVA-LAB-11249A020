import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class DateTimeExample {
    public static void main(String[] args) {

        // Date
        Date d = new Date();
        System.out.println("Date and Time: " + d);

        // Calendar
        Calendar c = Calendar.getInstance();

        System.out.println("Year: " + c.get(Calendar.YEAR));
        System.out.println("Month: " + (c.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + c.get(Calendar.HOUR));
        System.out.println("Minute: " + c.get(Calendar.MINUTE));
        System.out.println("Second: " + c.get(Calendar.SECOND));

        // Gregorian Calendar
        GregorianCalendar g = new GregorianCalendar();

        int year = g.get(GregorianCalendar.YEAR);

        if (g.isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}