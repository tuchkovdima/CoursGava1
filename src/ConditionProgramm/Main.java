package ConditionProgramm;

public class Main {
    public static void main(String[] args) {
        RemoutControllerInteger control = new RemoutControllerInteger();
        int temp = control.getTemperature(); //явный тип преобразования типов

        AirConditioner conditioner = new AirConditioner();
        conditioner.setTemperature(temp);
    }
}
