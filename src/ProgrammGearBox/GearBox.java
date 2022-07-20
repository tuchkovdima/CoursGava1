package ProgrammGearBox;

public class GearBox {

   /*
    0 - neitral
    1-6
    */

    public static final int MIN_GEAR = 1; //const
    public static final int MAX_GEAR = 6;
    private final GearBoxType type;
    private int gear = 0;

    public static final int TYPE_AUTOMATIC = 1;
    public static final int TYPE_MANUAL = 2;
    public static final int TYPE_ROBOT = 3;
    public static final int TYPE_VARIATOR = 4;

    public GearBox (GearBoxType type){
        this.type = type;
    }
    public GearBoxType getType(){
        return type;
    }

    public void shiftUp() {
        gear = gear < MAX_GEAR ? gear + 1 : gear;
    }

    public void shiftDown() {
        gear = gear > MIN_GEAR ? gear - 1 : gear;
    }

    public void switchRear() {
        gear = (gear > 1) ? gear : -1;
    }

    public void swichNeutral() {
        gear = 0;
    }
    public int getCarrentGear(){
        return gear;
    }
}
