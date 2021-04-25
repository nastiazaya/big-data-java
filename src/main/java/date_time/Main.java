package date_time;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class Main {
    public static void main(String[] args) throws ParseException {
        LocalTime now = LocalTime.now();
        LocalDate now1 = LocalDate.now();
        LocalDateTime now2 = LocalDateTime.now();

        LocalDate myBirthday = LocalDate.of(1978, 3, 10);
        LocalDate myBirthday2 = LocalDate.of(1980, 3, 10);
        System.out.println(myBirthday);

        long between = ChronoUnit.DAYS.between(myBirthday, myBirthday2);
        System.out.println("between = " + between);

        //take 2 params Dates in string format and return difference in days between
        System.out.println(deltaBetweenDays("2015-08-04", "2015-08-08"));
        //takes a sting in format yyyy-dd-mm and return string in format yy-mm-dd
        System.out.println(changeDateFormat("2015-04-07"));

    }

    public static double deltaBetweenDays(String daystr1, String daystr2){
        LocalDate day1 = LocalDate.parse(daystr1);
        LocalDate day2 = LocalDate.parse(daystr2);
        return ChronoUnit.DAYS.between(day1,day2);
    }


    public static String changeDateFormat(String dateStr){
        LocalDate date = LocalDate.parse(dateStr);
        return date.format(DateTimeFormatter.ofPattern("yy-MM-dd"));
    }
}