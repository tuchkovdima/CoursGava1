package ProgrammGearBox;

public class Main {
    public static void main(String[] args) {

        //прел\образование строки в соответствующий Enum

        GearBoxType type = GearBoxType.valueOf("ROBOT");
        GearBox gearBox = new GearBox(type);

        System.out.println(type);
    }
}
