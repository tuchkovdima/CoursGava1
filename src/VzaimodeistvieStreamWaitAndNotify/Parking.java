package VzaimodeistvieStreamWaitAndNotify;

public class Parking {
    private int parkingSize = 500;
    private int carCount = 0;

    public synchronized void in(){
        carCount++;
        System.out.println("Zavezen");
        System.out.println("Open mesta: " + (parkingSize - carCount));
    }

    public synchronized void out(){
        carCount--;
        System.out.println("vivezen");
        System.out.println("Open mesta: " + (parkingSize - carCount));
    }
}
