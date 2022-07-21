package LocaleDataAndLocaledatatime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class equalsData {
    public static void main(String[] args) {
        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = LocalDateTime.now().minusDays(2); //вычитаем 2 дня

        if (time1.isAfter(time1)){
            System.out.println("time1 is after time2");
        }
        System.out.println(time1.compareTo(time2));

        //вычисление разницы
        System.out.println(time1.until(time2, ChronoUnit.MINUTES));

    }
}
