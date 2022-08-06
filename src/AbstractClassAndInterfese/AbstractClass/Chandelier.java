package AbstractClassAndInterfese.AbstractClass;

public class Chandelier extends LightingDevice {
    public static final double MAX_BRIGHTNESS = 1D;
    public static final double MIN_DRIGHTNESS = 0D;

    private static final int LAMP_BRIGHTNESS_STEPS = 2;
    private static final double CONSUMPTION_COEFF = 1.095;

    private final int lampsCount;

    private Contrller contrller;

    private class Contrller { //внутренний не ствтический класс
        public void reset() {
            //some logic
        }
    }

    public Chandelier(int power, int lampsCount) {
        super(power);
        this.lampsCount = lampsCount;
        contrller = new Contrller();

    }

    public int getPower() {
        return power;
    }

    public int getLampsCount() {
        return lampsCount;
    }

    @Override
    public boolean isSwitchedOn() {
        return brightness > 0;
    }

    @Override
    public void setBrightness(double level) {
        double step = 1.0 / (lampsCount * LAMP_BRIGHTNESS_STEPS);
        int stepsCount = (int) Math.round(level / step);
        brightness = stepsCount * step;
        super.setBrightness(stepsCount * step);
        if (brightness == 0) {
            contrller.reset();
        }
    }

    @Override
    public double getEnergyConsumption() {
        return power * Math.pow(brightness, CONSUMPTION_COEFF);
    }


}
