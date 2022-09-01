package IerarhiaCollection.List.ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MetodArrayList4 {
    public static void main(String[] args) {
        //создаем объекты StringBilder
        StringBuilder sb1  = new StringBuilder("A");
        StringBuilder sb2  = new StringBuilder("B");
        StringBuilder sb3  = new StringBuilder("C");
        StringBuilder sb4  = new StringBuilder("D");

        //создали массив
        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        array[0].append("!!!"); // изменили 0 элемент массива

        //removeAll удаляет все элементы ArrayList которые находятся в параметрах

    }
}
