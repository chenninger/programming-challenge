package de.exxcellent.challenge;

import de.exxcellent.challenge.controller.Analyse;
import de.exxcellent.challenge.model.CSVReader;
import de.exxcellent.challenge.model.ObjectBuilder;
import de.exxcellent.challenge.model.SoccerData;
import de.exxcellent.challenge.model.WeatherData;

import java.util.HashMap;
import java.util.List;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        CSVReader reader = new CSVReader();
        List<String> weatherStrings = reader.readCSV("src/main/resources/de/exxcellent/challenge/weather.csv");
        List<WeatherData> weatherData = ObjectBuilder.buildWeatherData(weatherStrings);
        HashMap<WeatherData, Float> weatherWithDifference = Analyse.calculateTempDifference(weatherData);
        HashMap<WeatherData, Float> weatherSorted = Analyse.sortWeatherData(weatherWithDifference);
        Object[] objects = weatherSorted.keySet().toArray();
        WeatherData min= (WeatherData)objects[0];
        String dayWithSmallestTempSpread =Float.toString(min.getDay());

        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        List<String> soccerStrings = reader.readCSV("src/main/resources/de/exxcellent/challenge/football.csv");
        List<SoccerData> soccerData = ObjectBuilder.buildSoccerData(soccerStrings);
        HashMap<SoccerData, Integer> soccerWithDifference = Analyse.calculateGoalDifference(soccerData);
        HashMap<SoccerData, Integer> soccerSorted = Analyse.sortSoccerData(soccerWithDifference);
        Object[] keys = soccerSorted.keySet().toArray();
        SoccerData minDeltaGoals= (SoccerData)keys[0];
        String teamWithSmallestGoalSpread = minDeltaGoals.getTeam(); // Your goal analysis function call …

        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
