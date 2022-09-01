package IerarhiaCollection.List.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MetodArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("dima"); //добавляет новый элемент
        list1.add("dimas");
        list1.add("dddd");
        list1.add(1,"misha"); //поставить элемент на позицию 1
      //  System.out.println(list1);
//вывод элемента
        for(String  s  : list1){
            System.out.println(s + " ");
        }
        System.out.println();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(6);
//        for (int i = 0; i < list1.size() ; i++) { //size  размер
//            System.out.println(list1.get(i)); //вывидем элемент ArrayList с индексом 2
//        }
//        System.out.println(list1.get(2)); //вывидем элемент ArrayList с индексом 2

        //Set вставляет элемент в определенный индекс
        list1.set(1, "ddd");

        //remove удаление элемента
        list1.remove(0);
}
}
