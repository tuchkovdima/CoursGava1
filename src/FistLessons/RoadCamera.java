package FistLessons;

import java.util.Scanner;

public class RoadCamera {
    public static void main(String[] args) {

        //parameters

        int maxOncomingSpeed = 30; // максимальная скорость приближения
        int speedFineGrade = 20; // шаг при котором увеличивается штраф
        int finePerGrade = 500; // сумма штрафа на шаг
        int crimonalSpeed = 180; // вызов ментов при такой скорости
        int aLotOfRoad = 0;
        int moneyOnSpeed;
        String messege = "Police";


        System.out.println("take speed car:");
        int speedCar = new Scanner(System.in).nextInt(); //принимаем скорость авто


        if (speedCar >= crimonalSpeed) {

            aLotOfRoad = (speedCar - maxOncomingSpeed) / speedFineGrade;
            moneyOnSpeed = aLotOfRoad * finePerGrade;

            System.out.println(moneyOnSpeed + " " + messege);


        } else if (speedCar < crimonalSpeed && speedCar > maxOncomingSpeed) {
            System.out.println("not Police");

            aLotOfRoad = (speedCar - 30) / speedFineGrade;
            moneyOnSpeed = aLotOfRoad * finePerGrade;

            System.out.println(moneyOnSpeed);
        } else if (speedCar <= maxOncomingSpeed && speedCar >= 1) {
            System.out.println("Not Road Car");
        } else {
            System.out.println("take please number > 0 ");
        }

    }

}
