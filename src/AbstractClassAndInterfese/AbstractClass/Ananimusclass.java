package AbstractClassAndInterfese.AbstractClass;

import java.util.Comparator;
import java.util.TreeSet;

public class Ananimusclass {
    public static void main(String[] args) {
        TreeSet<LightingDevice> lightingDeviceTreeSet = new TreeSet<>(new Comparator<LightingDevice>() {
            @Override
            public int compare(LightingDevice o1, LightingDevice o2) {
                return Integer.compare(o1.getPower(), o2.getPower());
            }
        });
        LightingDevice device = new LightingDevice(400) {
            @Override
            public double getEnergyConsumption() {
                return power * brightness;
            }

            @Override
            public boolean isSwitchedOn() {
                return false;
            }
        };
    }
}

