import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {
    public static void main(String[] args){
        LocalDateTime timePoint = LocalDateTime.now();

        System.out.println(timePoint);

        LocalDate ld = LocalDate.of(2024, Month.AUGUST, 11);

        System.out.println(ld);

        LocalTime lt = LocalTime.of(12, 11);

        System.out.println(lt);

        LocalTime lt2 = LocalTime.parse("12:11");

        System.out.println(lt2);

        LocalDate theDate = timePoint.toLocalDate();

        System.out.println(theDate);

        System.out.println(timePoint.getMonthValue());

    }
}
