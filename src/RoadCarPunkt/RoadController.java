package RoadCarPunkt;

import java.util.Scanner;

public class RoadController {

    private static double passengerCarMaxWeight = 3500.0;//kg
    private static int passengerCarMaxHeight = 2000; //mm
    private static int controllrtMaxHeight = 4000; //mm

    private static int passengerCarPrice = 100;//RUB
    private static int cargoCarPrice = 250; //RUB
    private static int vehicleAdditionalPrice = 200; //RUB

    public static void main(String[] args) {
        System.out.println("How match car?");

        int carsCount = new Scanner(System.in).nextInt();

        for (int i = 0; i < carsCount; i++) {
            Car car = Camera.getNextCar();
            System.out.println(car);

            //пропуск автомабиля спецтранспорта бесплатно

            if (car.isSpecial) {
                System.out.println("Open");
                continue;
            }
            //проверяем высоту и массу автомабиля, вычисляем стоимость проезда
            int price = calculatePrice(car);
            if (price == -1) {
                continue;
            }

            System.out.println(price + "summa for oplat");
        }

    }

    private static int calculatePrice(Car car) {
        int carHeight = car.height;
        int price = 0;
        if (carHeight > controllrtMaxHeight) {
            System.out.println("not proezd");
            return -1;
        } else if (carHeight > passengerCarMaxHeight) {
            double weight = car.weight;

            //грузовой автомобиль
            if (weight > passengerCarMaxWeight) {
                price = passengerCarPrice;
                if (car.hasVehicle) {
                    price = price + vehicleAdditionalPrice;
                }
            }
            //легковой автомобиль
            else {
                price = cargoCarPrice;
            }

        } else {
            price = passengerCarPrice;

        }
        return price;

    }
}
