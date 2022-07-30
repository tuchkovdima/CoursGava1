package SpiskiElementov;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class NaboryUnicalnixElementov {
    public static void main(String[] args) {
        //arrayList порядок строго определен у каждого элемента есть индекс элементы можнео по индексам добавлять

        ArrayList<String> list = new ArrayList<>(); // чтобы найти нужный элемент нужно перебрать весь список и сравнить его с тем объектом, который мы ищем


        //лист список элементов который порядок строго определен и элементы могут быть одинаковые

        //коллекция уникальных элементов (не упорядоченный)
        HashSet<String> woeds = new HashSet<>(); // чтобы быстро найти воспользоваться методом containts

        woeds.add("первое ");
        woeds.add("seconf");
        woeds.add("ssss");

        for (String word : woeds){
            System.out.println(word);
        }
        System.out.println(woeds.contains("первое")); // метод выведет true/false

        TreeSet<String> upor = new TreeSet<>(); // элементы в алфавитном порядке упорядоченный набор элементов

        upor.add("a");
        upor.add("b");
        upor.add("t");
        upor.add("c");

        for (String up : upor){
            System.out.println(up);
        }
    }
}
