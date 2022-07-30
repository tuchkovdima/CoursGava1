package Object;

import Nasledovanie.ClassovJava.transport.Bus;

public class Main {
    public static void main(String[] args) {
        //clone - создает и возвращает копию объекта
        //equals(Object obj) - сравнивает текущий объект с объектом который передан в качестве параметра и возвращает либо true или false
        //hashcode()
        //native метод реализован не на джава
        // getClass() - возвращает класс текущего объекта
        Bus bus = new Bus(0.01);
        Class objectClass = bus.getClass();
        System.out.println(objectClass.getClass());

        System.out.println(bus);
        System.out.println(bus.toString());
        System.out.println(bus.getClass().getName() + "@" + Integer.toHexString(bus.hashCode()));
    }
}
