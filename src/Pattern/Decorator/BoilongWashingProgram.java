package Pattern.Decorator;

import javax.swing.text.html.HTMLDocument;

public class BoilongWashingProgram extends SpecialWashingProgram {
    public BoilongWashingProgram(WasingProgram wasingProgram){
        super(wasingProgram);
    }

    public void executeProgram(){
        warmerSetTemperature(95);
        wasingProgram.executeProgram();
    }
}
