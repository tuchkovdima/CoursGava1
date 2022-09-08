package IerarhiaCollection.Vector;

import java.util.Vector;
public class VectorEx {
    public static void main(String[] args) {
        /*
        Vector  устаревший synchronized класс. В своей основе содержит массив элементов Object.
         */
        Vector vector1 = new Vector();
        vector1.add("za");
        vector1.add("zccc");
        vector1.add("33");
        System.out.println(vector1);
        System.out.println(vector1.firstElement());
        System.out.println(vector1.lastElement());
        vector1.remove(2);
        System.out.println(vector1);
        System.out.println(vector1.get(1));



    }
}
