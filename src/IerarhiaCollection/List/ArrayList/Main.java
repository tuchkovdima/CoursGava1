package IerarhiaCollection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList  это массив, который может изменять свою длинну
         */

        //создание ArrayList пример 1
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("zaur");
        list1.add("dima");
        list1.add("dania");
        System.out.println(list1);

        //создание ArrayList пример 2
        ArrayList<String> list2   =  new ArrayList<>();
        list2.add("1");
        System.out.println(list2);

        //создание ArrayList пример 3
        ArrayList<String> list3 = new ArrayList<>(30);
        list1.add("zaur");
        list1.add("dima");

        //создание ArrayList пример 4
        List<String> list4 = new ArrayList<>();

        //создание ArrayList пример 5
        ArrayList<String> list5 = new ArrayList<>(list1);

        //создание ArrayList пример 6 (не стоит)
        ArrayList list6 = new ArrayList();
        list6.add("zaur");
        list6.add("dima");
        list6.add("dania");
        list6.add(7);
        list6.add(new Car());
        System.out.println(list1);
    }
}
class Car{}