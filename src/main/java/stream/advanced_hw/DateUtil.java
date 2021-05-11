
package stream.advanced_hw;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DateUtil {

    public static void printBlackFridaySorted(int startYear, int endYear) {
        LocalDate startDate = LocalDate.of(startYear, 1, 1);
        LocalDate endDate = LocalDate.of(endYear, 12, 31);
        long daysToLimit = ChronoUnit.DAYS.between(startDate, endDate);
        List<String> blackFridays = Stream.iterate(startDate, localDate -> localDate.plusDays(1))
                .limit(daysToLimit)
                .filter(date -> date.getDayOfWeek().equals(DayOfWeek.FRIDAY))
                .filter(data -> data.getDayOfMonth() == 13)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()))
                .entrySet().stream().map(e -> e.toString().replace("=","-"))
                .sorted((e1,e2) -> e2.charAt(e2.length()-1) - e1.charAt(e1.length()-1))
                .collect(Collectors.toList());
        blackFridays.forEach(System.out::println);
    }
}