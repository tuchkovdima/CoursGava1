package Pattern.Decorator;

public class DoubleSpinningProgram extends SpecialWashingProgram {
    public DoubleSpinningProgram(BasicWashingProgram washingProgram){
        super(washingProgram);
    }

    public void executeProgram(){
        BasicWashingProgram washingProgram = (BasicWashingProgram) this.wasingProgram;
        washingProgram.executeProgram();
        for (int i = 0; i < 5; i++) {
            washingProgram.rotateDurm(-30);
            washingProgram.rotateDurm(30);
        }
        washingProgram.rotateDurm(1500);
        washingProgram.drainOff();
    }

}
