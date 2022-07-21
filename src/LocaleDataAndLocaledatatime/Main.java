package LocaleDataAndLocaledatatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate birthday = LocalDate.of(1987, 4,25); //создать дату
        System.out.println(birthday.plusYears(18)); //когда данному человеку будет 18 лет

        LocalDateTime nowNY = LocalDateTime.now(ZoneId.of("Amtrica/New_York")); //время в нью-йорке
        System.out.println(nowNY);

        //парсинг - преобразование текста в объект класса

        String date = "23/01/2021";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");//преобразование строки времени

        LocalDate localDate = LocalDate.parse(date,formatter);
        System.out.println(localDate);

        //Дату в строку
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                .localizedBy(new Locale("us"));//Краткий формат даты и времени на сша

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(formatter1.format(now));
    }
}
