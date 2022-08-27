import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //17
        ArrayList<Integer> arrayListA =  new ArrayList<>();
        arrayListA.add(2);
        arrayListA.add(1);
        arrayListA.add(3);
        arrayListA.add(4);
        arrayListA.add(-2);
        arrayListA.add(9);
        arrayListA.add(8);
        arrayListA.add(54);
        arrayListA.add(10);
        arrayListA.add(-1);

        ArrayList<Integer> arrayListB  = new ArrayList<>();
        ArrayList<Integer> arrayListC = new ArrayList<>();

        for (int i = 0; i < arrayListA.size(); i++) {

            if( arrayListA.get(i)> 0){
                arrayListB.add(arrayListA.get(i));
            }
            if (arrayListA.get(i) <  0){
                arrayListC.add(arrayListA.get(i));

            }
        }
        Collections.reverse(arrayListC);

        System.out.println("Mass A" + arrayListA);
        System.out.println("Mass B" + arrayListB);
        System.out.println("Mass C" + arrayListC);
    }
}
