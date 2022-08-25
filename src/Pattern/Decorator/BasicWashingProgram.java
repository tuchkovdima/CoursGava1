package Pattern.Decorator;

public class BasicWashingProgram implements WasingProgram{
    public void fillByWater(){
        System.out.println("Filling by new water");
    }

    public void takePowder(){
        System.out.println("Taking powder");
    }
    public void rotateDurm(int speed){
        System.out.println("Rotating drum with speed" + speed + "rpm");
    }
    public void drainOff(){
        System.out.println("Draining off the water");
    }

    @Override
    public void executeProgram() {
        fillByWater();
        takePowder();
        for (int i = 0; i < 40; i++) {
            rotateDurm(30);
            rotateDurm(-30);
        }
        drainOff();
        rotateDurm(1500);

        drainOff();
        rotateDurm(1500);

    }
}
