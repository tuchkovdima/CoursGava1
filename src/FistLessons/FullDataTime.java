package FistLessons;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class FullDataTime {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format((formatter)));
    }
}
