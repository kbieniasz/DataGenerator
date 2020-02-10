import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Scanner date2 = new Scanner(System.in);
        System.out.println("Podaj datę [dd.mm.yyyy] ");
        String time = date2.nextLine();
        date2.close();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String dateString = time;
        Date date1 = dateFormat.parse(dateString);

        System.out.println("to będzie: " + date1);

        Date date = new Date(date1.getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 12);
        calendar.add(Calendar.DATE, 1);
        date = calendar.getTime();
        String strDate = dateFormat.format(date);

        System.out.println("za rok: " + strDate);

    }
}
