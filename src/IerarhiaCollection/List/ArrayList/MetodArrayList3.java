package IerarhiaCollection.List.ArrayList;

import java.util.ArrayList;

public class MetodArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("dd");
        list1.add("dddddd");
        list1.add("efef");
        System.out.println(list1);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("ssssss");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("!!");
        list2.add(">>>");
        list2.addAll(list1);
        list2.addAll(1,list3);
        System.out.println(list2);

        list2.clear(); // очищает ArrayList

        //indexOf принимает объект и позвращает его позицию
        System.out.println(list1.indexOf("dd"));

        //isEmpty, проверяет пуст ли ArrayList true/false
        System.out.println(list1.isEmpty());

        //contains содержит ли ArrayList какой то объект true/false
        System.out.println(list1.contains("dd"));
    }
}
