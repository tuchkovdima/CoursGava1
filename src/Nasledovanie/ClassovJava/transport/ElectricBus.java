package Nasledovanie.ClassovJava.transport;

public class ElectricBus extends Bus {//расширяем исходный класс бас
    private final double minimalTankFuullessRate;
    private static int count;
    private static final double degradationRate = 0.0001;
    private static final double minRateToDegrade = 0.1;


    public ElectricBus(double consumptionRate, double minimalTankFuullessRate) {  // конструктор
        super(consumptionRate); //конструктор класса родителя

        this.minimalTankFuullessRate = minimalTankFuullessRate;
        count++;
    }

    @Override
    public void refuel(double tankRate) {
        super.refuel(tankRate);
        if (tankRate > minimalTankFuullessRate) {
            consumptionRate += degradationRate;

        }
    }
    // переопределение методов overriding


    @Override //обозначает, что метод переопределен
    public int powerReserve() {
        double remainingRate = getTankFullnessRate() - minimalTankFuullessRate;    //оставшийся уровень

        if (remainingRate <= 0) {
            return 0;
        }
        //расчитаем и вернем запас хода исходя из этого числа
        return (int) (remainingRate / getConsumptionRate());
    }
    // метод для возвращения колличества электробусов

    public static int getCount() { // НИКАКОГО ПЕРЕОПРЕДЕЛЕНИЯ СТАТИЧЕСКИХ МЕТОДОВ НЕ ПРОИСХОДИТ
        return count;
    }
}
