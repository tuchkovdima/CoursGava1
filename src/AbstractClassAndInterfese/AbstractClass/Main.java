package AbstractClassAndInterfese.AbstractClass;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //классы, которые можно наследовать, но нельзя создавать объекты
        //абстрактные методы, методы которые не содержат реализацию и нужно ее делать в классах наследниках

        ArrayList<Lamp> lamps = new ArrayList<>();
        lamps.add(new Lamp(100));
        lamps.add(new Lamp(20));
        lamps.add(new Lamp(40));
        lamps.add(new Lamp(150));

        Collections.sort(lamps);

        for (Lamp lamp : lamps){
            System.out.println(lamp);
        }
        Lamp lamp = new Lamp(100);
        lamp.setType(Lamp.Type.LED);
    }


}
