/**package MetroStationProgramm;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

import javax.sound.sampled.Line;
import java.util.List;
import java.util.Scanner;

//модульное тестирование
//расчет маршрутов на карте метро
public class Main {
    private static String dataFile = "src/MetroStationProgramm/";
    private static Scanner scanner;

    private static StationIndex stationIndex;

    public static void main(String[] args) {
        RouteCalculator calculator = getRouteCalculator();

        System.out.println("Программа для расчета маршрутов метрополитена Санкт-Петербург");
        scanner = new Scanner(System.in);

        for (; ; ) {
            Station from = takeStation("Введите станцию отправления:");
            Station to = takeStation("Введите станцию назначения:");

            List<Station> route = calculator.getShortestRoute(from, to);
            System.out.println("Маршрут:");
            printRoute(route);

            System.out.println("Длительность: " + RouteCalculator.calculateDuration(route) + "минут");
        }
    }

    private static RouteCalculator getRouteCalculator() {
        createStationIndex();
        return new RouteCalculator(stationIndex);
    }

    private static void printRoute(List<Station> route) {
        Station previousStation = null;

        for (Station station : route) {
            if (previousStation != null) {
                Line prevLine = previousStation.getLine();
                Line nextLine = station.getLine();
                if (!prevLine.equals(nextLine)) {
                    System.out.println("\t Переход на станцию " + station.getName() + " (" + nextLine.getName() + " линия)");
                }
            }
            System.out.println("\t" + station.getName());
            previousStation = station;
        }

    }

    private static Station takeStation(String message) {
        System.out.println(message);
        String line = scanner.nextLine().trim();
        Station station = stationIndex.getStation(line);
        if (station != null) {
            return station;
        }
        System.out.println("Станция не найдена : (");
        return station; // ?
    }
private static void createStationIndex(){
    stationIndex = new StationIndex();
    try {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(getJsonFile());

        JSONArray lineArray = (JSONArray) jsonData.get("lines");
        parseLines(lineArray);

        JSONObject stationsObject = (JSONObject) jsonData.get("stations");
        parserStations(stationsObject);

        JSONArray connectionsArray = (JSONArray) jsonData.get("connections");
        parseConnections(connectionsArray);
    }
    catch (Exception ex){
        ex.printStackTrace();
    }
}
private static void parseConnections(JSONArray connectionsArray){
        connectionsArray.forEach(connectionObject -> {
            stationIndex.equals(me);

        });
}
}


 */