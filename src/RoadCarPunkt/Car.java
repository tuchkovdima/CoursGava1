package RoadCarPunkt;

public class Car {
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    public String toString() {
        String special = isSpecial ? "Special Car" : "";
        return "\n===========================\n" +
                special + "car is number" + number +
                ": \n\t Height" + height + "mm\n\t Massa:" + weight + " KG";
    }
}
