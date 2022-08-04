package AbstractClassAndInterfese.AbstractClass;

public interface ElectricDevice {

    void switchOn();
    void switchOff();

    double getEnergyConsumption(); // текущее энергопотребление

    default void toggle(){
        if (isSwitchedOn()) {
            switchOff();
        }
        else {
            switchOn();
        }
    }

    boolean isSwitchedOn();

}
