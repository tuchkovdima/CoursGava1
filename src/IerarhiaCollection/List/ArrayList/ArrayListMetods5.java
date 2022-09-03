package IerarhiaCollection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMetods5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("dd");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        System.out.println(list1);

//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("5");
//        list2.add("2");
//        list2.add("3");
//        list2.add("ufff");
//
//        list1.removeAll(list2);
//
//        //retainAll оставит в ArrayList , только  те элементы, которыке есть ArrayList из параметра
//        list1.retainAll(list2);
//
//        //containsAll содержит ли все элементы ArrayLista из этого параметра
//        boolean result = list1.containsAll(list2);
//        System.out.println(result);

//        //subList делает отрывок из листа
//        List<String> myList = list1.subList(1,4);
//        System.out.println(myList);
//
//        //toArray из нашего ArrayList получаем массив  типа Object
//        Object[]  array = list1.toArray();
//        // если хотим полчить массив String, а не Object
//        String[]  array2 = list1.toArray(new String[0]); //0 и не думаем о размере массива
//
//        for (String s:array2){
//            System.out.println(s);
//        }

       List<Integer> list2 = List.of(3,8,13);//солздали лист и добавили элементы без метода add (нельзя модифицировать)
        System.out.println(list2);

        List<String> list3 = List.copyOf(list1); //(нельзя модифицировать) не могут содержать null
        System.out.println(list3);



    }
}
