package Pattern.Decorator;

public class SpecialWashingProgram {
    protected WasingProgram wasingProgram;
    public SpecialWashingProgram (WasingProgram wasingProgram){
        this.wasingProgram = wasingProgram;
    }
    public void warmerSetTemperature(int temperature){
        System.out.println("Warm up to" + temperature + "degrees");
    }
}
