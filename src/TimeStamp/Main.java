package TimeStamp;

        import java.time.LocalDateTime;
        import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        //получение текущей метки времени
        long start = System.currentTimeMillis(); //использовать к примеру для изменения длительности программного кода

        String line = "";
        for (int i = 0; i < 10000; i++) {
            line += Math.random();
        }
        System.out.println(System.currentTimeMillis() - start);

        //хранение времени в формате timestamp (преобразование метки времени в дату)
        LocalDateTime now = LocalDateTime.ofEpochSecond(System.currentTimeMillis() / 1000,
                0, ZoneOffset.ofHours(3));
        System.out.println(now);

        //как получить метку времени из даты
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1.toEpochSecond(ZoneOffset.ofHours(3))); // текущая метка времени в секудах
    }

}
