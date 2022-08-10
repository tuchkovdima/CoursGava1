/**package MetroStationProgramm.core;

import MetroStationProgramm.Station;

import java.util.List;

public class Line {
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    public Line(int number, String name, List<Station> stations) {
        this.number = number;
        this.name = name;
        this.stations = stations;
    }

    @Override
    public String toString() {
        return "Line{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", stations=" + stations +
                '}';
    }

    private int number;
    private String name;
    private List<Station> stations;
}
 */