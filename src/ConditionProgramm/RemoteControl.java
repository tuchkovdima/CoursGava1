package ConditionProgramm;

public class RemoteControl {
    private final double START_TEMPERATURE = 32.0;
    private double temperature;
    public RemoteControl(){
        temperature = START_TEMPERATURE;
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }

    public double getTemperature(){
        return temperature;
    }
}
