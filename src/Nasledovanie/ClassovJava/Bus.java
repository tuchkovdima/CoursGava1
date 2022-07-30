package Nasledovanie.ClassovJava;

public class Bus {

    private double tankFullnessRate; // число, на сколько заполнен топливный бак 0-1
    private final double consumptionRate; // расход топлива на 1 км

    //колличество созданных автобусов
    private static int count;



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
    public final void refuel (double tankRate){ // заправка
        double total = tankFullnessRate + tankRate;
        tankFullnessRate = total > 1 ? 1 : total;
    }
    public int powerReserve(){ // на какое колличество килома\етров хватит оставшегося запаса топлива
        return (int) (tankFullnessRate / consumptionRate);
    }


}
