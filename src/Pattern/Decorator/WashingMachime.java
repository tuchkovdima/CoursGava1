package Pattern.Decorator;

public class WashingMachime {
    public static void main(String[] args) {
        BasicWashingProgram program = new BasicWashingProgram(); //оборачиваем в DoubleSpinningProgram
        DoubleSpinningProgram spinningProgram = new DoubleSpinningProgram(program);
        BoilongWashingProgram boilongWashingProgram = new BoilongWashingProgram((WasingProgram) spinningProgram);
        boilongWashingProgram.executeProgram();
    }
}
