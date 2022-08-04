package Nasledovanie.ClassovJava;

import Nasledovanie.ClassovJava.transport.Bus;
import Nasledovanie.ClassovJava.transport.ElectricBus;

public class Main {
    public static void main(String[] args) {

        ElectricBus electricBus2 = new ElectricBus(0.002, 0.4) ;

        Bus bus4 = new ElectricBus(1,5);



        //задача на основе кода по автобусам наследовать для электробуса
        ElectricBus bus = new ElectricBus(0.001, 0.1);
        //заполняем до ста процентов
        bus.refuel(1);
        System.out.println("Resrev: " + bus.powerReserve());
        //израсходуем топлива на 50 км
        System.out.println("Drive 50 km: " + bus.run(50));
        // снова проверим резерв
        System.out.println("Resrev: " + bus.powerReserve());
        // расходуем топлива на 900 км
        System.out.println("Drive 900 km: " + bus.run(900));
        System.out.println("Resrev: " + bus.powerReserve());
        System.out.println("Drive 100 km: " + bus.run(100));


        //создадим 3 обычных автобуса и 2 электробуса
        Bus bus1 = new Bus(0.1);
        Bus bus2 = new Bus(0.2);
        Bus bus3 = new Bus(0.3);

        ElectricBus electricBus = new ElectricBus(0.1, 0.01);
        ElectricBus electricBus1 = new ElectricBus(0.2, 0.1);

        //подсчитывается общее колличество автобусов и электробусов если нет метода getCount
        System.out.println("Колличество автобусов:" + Bus.getCount()) ;
        System.out.println("Колличество электробусов:" + ElectricBus.getCount());

    }
}
