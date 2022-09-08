package IerarhiaCollection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1= new HashMap<>();
        //добавляем элементы
        map1.put(1, "Dima");
        map1.put(3,"Lol");
        map1.put(4, "sssssss");
        map1.put(5,"yyyyyyy");
        map1.put(6, "dfvfdv");
        map1.put(7,"kkkkk");

        //можно
        map1.put(null, "dawad");
        map1.put(344, null);
        /*
      Клюи уникальные, если одинаковый ключ и разнае значения, то значение перезаписывается
         */
        System.out.println(map1);

        map1.putIfAbsent(100,"asdas"); // добавь элемент в нашу коллекцию мап, если такого элемента нет (ключ)

        System.out.println(map1.get(1)); // вывод значения по ключу

        System.out.println(map1.remove(7)); //удалить элемент

        //поиск значения
        System.out.println(map1.containsValue("Dima"));//вернется true

        //проверка ключей, которые мы ищем
        System.out.println(map1.containsKey(6));//вернется true

        //возвращает множество всех ключей
        System.out.println(map1.keySet());

        //возвращает множесто значений
        System.out.println(map1.values());

        //ключи и значения разных типов
        Map<String,String> map2 = new HashMap<>();

        map2.put("Sasha", "good");
        map2.put("Mishsa", "sad");
        map2.put("Oleg", "ggggg");




    }
}
