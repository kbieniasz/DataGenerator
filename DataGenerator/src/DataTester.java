import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataTester {
    public static void main (String [] args)
    {
        String s = "O'Reaily";
        System.out.println(s);
      //  String s2 = s.replaceAll("\'","");
        System.out.println(s.replaceAll("\'",""));



        // Date date = new Date(116,11,20);
        //System.out.println( date.toString());
        //date.setYear(117);
        //System.out.println( date.toString());
       // LocalDateTime d = new LocalDateTime(23/03/2008);
       /* String dateString  = "01/12/1992"; // nie korzystaj z new String() !!!!!!

        String dates;

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj date: ");
        dates = input.nextLine();//pobranie daty od użytkownika

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date1String = dates;
        System.out.println(dates);//wyświetlenie daty w konsoli wskazanej przez użytkownika

        LocalDate podanaData = LocalDate.now();
        System.out.println(podanaData.getDayOfWeek());

        LocalDate todayNextYear = podanaData.plusYears(1);
        System.out.println(podanaData.plusYears(1));

        System.out.println(todayNextYear.getDayOfWeek());

        */

    }
    public Date addDays (Date starting)
    {
        int dzien = starting.getDay();
        return starting;
    }

  /*  public static void main2 (String [] args)
    {
        String s = "O'Reaily";
        System.out.println(s);
        s.replaceAll("'","");
        System.out.println(s);
    }
    */
}
