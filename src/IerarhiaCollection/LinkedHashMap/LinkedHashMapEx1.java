package IerarhiaCollection.LinkedHashMap;

import IerarhiaCollection.EqualsAndHashcode.HashCodeEx1;
import IerarhiaCollection.TreeMap.Student;

import java.util.LinkedHashMap;

public class LinkedHashMapEx1  {
    public static void main(String[] args) {
        /*
        acsess order true порядок элементов меняется

         */
        LinkedHashMap<Double,Student> map1 = new LinkedHashMap<>(16, 0.75f, false);

        Student st1 = new Student(1, "d", "f");
        Student st2 = new Student(2, "s", "f");
        Student st3 = new Student(3, "f", "f");
        Student st4 = new Student(4, "v", "f");


        map1.put(5.8, st1);
        map1.put(5.4, st2);
        map1.put(5.6, st3);
        map1.put(5.5, st4);

        System.out.println(map1); //В каком порядке добавили, в таком и будут содержаться эти элементы


    }
}
