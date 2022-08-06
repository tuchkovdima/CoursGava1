package AbstractClassAndInterfese.AbstractClass;

public abstract class LightingDevice implements ElectricDevice, Comparable {

    public static final double MAX_BRIGHTNESS = 1D;
    public static final double MIN_DRIGHTNESS = 0D;
     protected double brightness;
     protected final int power; // мощность лампы

    public LightingDevice(int power) {
        this.power = power;

    }
    public int getPower(){
        return power;
    }
    public int compareTo(Object o) {
        LightingDevice device = (LightingDevice) o;
        return Integer.compare(power, device.power);
    }
    @Override
    public String toString() {
        return getClass().getName() + "device with power: " + power;
    }
    @Override
    public void switchOn(){
setBrightness(MAX_BRIGHTNESS);
    }
    @Override
    public void switchOff(){
        setBrightness(MIN_DRIGHTNESS);
    }


    public void setBrightness(double level) { // число яркости находится от минимального до макс значения
// проверяется, что переданное значение находится в дапазоне от 0 до 1
        if (level < MIN_DRIGHTNESS) {
            brightness = MIN_DRIGHTNESS;
        } else if (level > MAX_BRIGHTNESS) {
            brightness = MAX_BRIGHTNESS;
        } else {
            brightness = level;
        }
    }


    public double getBrightness() {
        return brightness;
    }
    //метод , который изменяет яркость на нужное колличество процентов
    public void changeBrightness(double rate) {
        double changed = brightness + brightness * rate;
        setBrightness(changed);
    }

    public abstract double getEnergyConsumption(); // абстрактный метод

}
