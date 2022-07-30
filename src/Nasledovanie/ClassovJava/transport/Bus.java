package Nasledovanie.ClassovJava.transport;

import java.util.Objects;

public class Bus {

    private double tankFullnessRate; // число, на сколько заполнен топливный бак 0-1
    protected  double consumptionRate; // расход топлива на 1 км

    //колличество созданных автобусов
    private static int count;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // проверка на равенство ссылок
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Double.compare(bus.tankFullnessRate, tankFullnessRate) == 0 && Double.compare(bus.consumptionRate, consumptionRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tankFullnessRate, consumptionRate);
    }

    public Bus(double consumptionRate) { //конструктор
        this.consumptionRate = consumptionRate;
        count++;
    }

    public static int getCount() { //метод, который возвращает колличество автобусов
        return count;
    }

    public double getTankFullnessRate() {
        return tankFullnessRate;
    }

    public void setTankFullnessRate(double tankFullnessRate) {
        this.tankFullnessRate = tankFullnessRate;
    }

    public double getConsumptionRate() {
        return consumptionRate;
    }

    public boolean run(int distance){ //проезд автобуса на определенное рассояние в километрах
        if (powerReserve() < distance){
            return false;
        }
        tankFullnessRate -= distance * consumptionRate;
        return true;
    }
    public  void refuel (double tankRate){ // заправка
        double total = tankFullnessRate + tankRate;
        tankFullnessRate = total > 1 ? 1 : total;
    }
    protected int powerReserve(){ // на какое колличество килома\етров хватит оставшегося запаса топлива
        return (int) (tankFullnessRate / consumptionRate);
    }


    @Override
    public String toString() { //возвращает строковое представлениме объекта
        return "Bus{" +
                "tankFullnessRate=" + tankFullnessRate +
                ", consumptionRate=" + consumptionRate +
                '}';
    }
}
