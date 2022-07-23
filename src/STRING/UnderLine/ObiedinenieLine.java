package STRING.UnderLine;

import java.util.StringJoiner;

public class ObiedinenieLine {
    public static void main(String[] args) {
        //запись строк через запятую
        String name1 = "Vasili";
        String name2 = "Georgi";
        String name3 = "Alex";

        StringJoiner joiner = new StringJoiner(",");
        joiner.add(name1);
        joiner.add(name2);
        joiner.add(name3);
        System.out.println(joiner);

        String list = String.join(", ", name1, name2, name3);
        System.out.println(list);
    }
}
