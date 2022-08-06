package StaticAndDefaltMetodInIInterfecce;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       // Comparator.comparing(); передать указатель на метод
        Comparator.reverseOrder();// задать обратный компаратор

        //чтобы ttreeset был ппреопределенн в обратном порядке
        TreeSet<String> list = new TreeSet<>(Comparator.reverseOrder());

    }
}
