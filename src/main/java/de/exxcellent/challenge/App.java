package de.exxcellent.challenge;

import de.exxcellent.challenge.controller.AnalyseWeather;
import de.exxcellent.challenge.model.CSVReader;
import de.exxcellent.challenge.model.WeatherBuilder;
import de.exxcellent.challenge.model.WeatherData;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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
        List<WeatherData> weatherData =WeatherBuilder.buildWeatherData(weatherStrings);
        HashMap<WeatherData, Float> weatherWithDifference = AnalyseWeather.calculateDifference(weatherData);
        HashMap<WeatherData, Float> weatherSorted = AnalyseWeather.sortWeatherData(weatherWithDifference);
        Object[] objects = weatherSorted.keySet().toArray();
        WeatherData min= (WeatherData)objects[0];
        Float minDay =min.getDay();

        System.out.printf("Day with smallest temperature spread : %s%n", minDay);

        String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
