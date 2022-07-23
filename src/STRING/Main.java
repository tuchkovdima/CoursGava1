package STRING;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String name = "Дмитрий";
        String empty = "";

        //boolean isEmpty = empty.length() == 0;
        System.out.println(empty.isEmpty()); //строка является пустой
        System.out.println(empty.isBlank()); // если есть пробельные символы, то true

        String blank = " \t \n ";
        System.out.println(blank.isBlank());

        //конкратинация объединение строк
        String name1 = "Дмитрий";
        String surname = "Петров";
        //int age = 55;
        LocalDate birthday = LocalDate.of(1980, 4,15);

        String personInfo = name1 + " " + surname + " " + birthday;
        System.out.println(personInfo);



    }
}
