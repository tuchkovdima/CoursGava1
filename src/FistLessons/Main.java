package FistLessons;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        //первая программа
        System.out.println("first programm");
        System.out.println("дата и время: ");
        System.out.println(LocalDateTime.now()); // текущая дата и текущее время

        //программа вторая
        //система расчета стоимости заправки
        System.out.println("second programm");
        System.out.println("Система расчета топлива:");

        int fuelType = 92; //тип топлива
        int amount = 50; // колличество литров

        double fuel92prise = 60.2; //стоимость бензина
        double fule95price = 67.33;

        double fullprice = 0;
        double discount = 0;
        boolean peopleDiscount = true;

        if (fuelType == 92) {
            peopleDiscount = false;
            System.out.println(peopleDiscount);
            fullprice = fuel92prise;
        }
       else if (fuelType == 95){
            fullprice = fule95price - (0.1 * fule95price); //скидка 10%
        }
       else {
            System.out.println("неверный тип топлива");
       }
       if(amount < 1) {
           System.out.println("указано малое колличество топлива");
       }

        System.out.println("Цена выбранного топлива" + fullprice + "руб");
        System.out.println(fuelType);

        double totalPrice = fullprice * amount; // цена бензина на его колличество в литрах
        System.out.println("Общая стоимость заправки"+totalPrice);
    }
}
