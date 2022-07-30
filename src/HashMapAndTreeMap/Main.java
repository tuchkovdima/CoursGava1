package HashMapAndTreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //Map может храниться соответствие ключей с неким значением, ключи уникальные

      //  HashMap<String, Integer> good2count = new HashMap<>(); //будут не отсортированные
        TreeMap<String, Integer> good2count = new TreeMap<>(); //в алфовитном порядке

        Scanner scanner = new Scanner(System.in);

        for (;;){
            String goodName = scanner.nextLine();

            if (goodName.equals("LIST")){ // после слова принтятся наши товары и их колличества
                printMap(good2count);
                continue;
            }

            int count = 1;
            if (good2count.containsKey(goodName)) {
                count = good2count.get(goodName) + 1;
            }
                good2count.put(goodName, 1);
            }
        }
    private static void printMap(Map<String, Integer> map){

        for (String key : map.keySet()){
            System.out.println(key + "=>" + map.get(key));
        }
    }
}
