package HashMapAndTreeMap.SearchAndSortch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // в ArrayList есть метог contains который проходит по всемсу списку и сравнивает

        //бинарный поиск - разбиваем по серединкам

        // по хэшу знали номер страницы

        ArrayList<String> items = new ArrayList<>();
        Collections.sort(items); //меняет аррай на отсортированный

        int index = Collections.binarySearch(items, "hors") ;  //возвращает целое число, то есть индекс элемента ( на вход он получает ту коллекцию которую мы ищеи и искомую строку)
    // если искомая строка не нашлась, этот метод возвращает -1
    }
}
