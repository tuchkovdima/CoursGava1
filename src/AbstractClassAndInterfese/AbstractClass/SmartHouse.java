package AbstractClassAndInterfese.AbstractClass;

import java.util.ArrayList;

public class SmartHouse {

    private ArrayList<ElectricDevice> devices;

    public SmartHouse(){

        devices = new ArrayList<>();
        initLghtingDevices();
    }

    public double getEnergyConsumption() {
        double sum = 0;
        for (ElectricDevice device : devices){
            sum += device.getEnergyConsumption();
        }
        return sum;
    }

public void switchOffAllLight() {
        for (ElectricDevice device : devices){
            if (device instanceof LightingDevice){ //instanceof tru or false
                device.switchOff();
            }
        }
}

    public void swichOffAllDevices (){
        for (ElectricDevice device : devices){ //проход по всем устройствам, которыке есть в доме
            device.switchOff();
        }
    }
    private void initLghtingDevices() {

        devices.add(new Lamp(100));
        devices.add(new Lamp(60));
        devices.add(new Lamp(70));
        devices.add(new Lamp(80));
        devices.add(new Lamp(65));
        devices.add(new Chandelier(200,4));
        devices.add(new Chandelier(200,3));
        devices.add(new Chandelier(200,56));
        devices.add(new Chandelier(200,6));

    }
}
