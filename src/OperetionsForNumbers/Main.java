package OperetionsForNumbers;

public class Main {
    public static void main(String[] args) {
        int value = 55;
        value /= 11;
        System.out.println(value);

        //сравнение

        double a = 5.574;
        double b = 5.674;
       /* if (a == b){
            System.out.println("a equals b");
        }
       */
        boolean comperison = a==b;
        if (comperison){
            System.out.println("a equals b");
        }
        //метод Math
        System.out.println(Math.abs(400000)); //модуль числа
        System.out.println(Math.pow(5, 2)); //возведение в квадрат
        System.out.println(Math.round(2.54));//округление числа

    }

}
