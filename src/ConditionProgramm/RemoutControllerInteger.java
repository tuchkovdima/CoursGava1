package ConditionProgramm;

public class RemoutControllerInteger {
    private final int START_TEMPERATURE = 32;
    private int temperature;

    public RemoutControllerInteger() {
        temperature = START_TEMPERATURE;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
