package AbstractClassAndInterfese.AbstractClass;

public class Lamp extends LightingDevice {

    private Type type;
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum  Type {
        INCANDESCENT,
        FILAMENT,
        LED,
        LUMINESCENT
    }
    public Lamp(int power) {
        super(power);
    }

    @Override
    public double getEnergyConsumption() { // текущее энергопотребление лампы
        return power * brightness;
    }

    @Override
    public void toggle() {
        super.toggle();
    }

    @Override
    public boolean isSwitchedOn() {
        return false;
    }

    @Override
    public int compareTo(Object o) {
        Lamp lamp = (Lamp) o;
        return Integer.compare(power, lamp.power);
    }

    @Override
    public String toString() {
        return "Lamp with power: " + power;
    }
}
