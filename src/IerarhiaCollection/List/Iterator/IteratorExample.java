package IerarhiaCollection.List.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("xxx");
        list1.add("yyy");
        list1.add("zzzz");
        list1.add("eeee");

        Iterator<String> iterator = list1.iterator(); //iterator повториитель, с помощью него, мы можем пробежаться по
        // элементам нашего List

        while (iterator.hasNext()){ //если есть последующий элемент
            System.out.println(iterator.next());
        }


    }
}
