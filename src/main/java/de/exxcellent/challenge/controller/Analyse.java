package de.exxcellent.challenge.controller;

import de.exxcellent.challenge.model.SoccerData;
import de.exxcellent.challenge.model.WeatherData;

import java.util.*;
import java.util.stream.Collectors;

public class Analyse {

    public static HashMap<WeatherData, Float> calculateTempDifference(List<WeatherData> data) {
        HashMap<WeatherData, Float> result = new HashMap<WeatherData, Float>();
        for (WeatherData dataLine : data) {
            Float diff = dataLine.getMxT() - dataLine.getMnT();
            result.put(dataLine, diff);
        }
        return result;
    }

    public static HashMap<SoccerData, Integer> calculateGoalDifference(List<SoccerData> data) {
        HashMap<SoccerData, Integer> result = new HashMap<SoccerData, Integer>();
        for (SoccerData dataLine : data) {
            int diff = Math.abs(dataLine.getGoals() - dataLine.getGoals_Allowed());
            result.put(dataLine, diff);
        }
        return result;
    }

    public static HashMap<WeatherData,Float> sortWeatherData(HashMap<WeatherData,Float> unsorted){
        HashMap<WeatherData, Float> sortedMap =
                unsorted.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        return sortedMap;
    }

    public static HashMap<SoccerData, Integer> sortSoccerData(HashMap<SoccerData, Integer> unsorted) {
        HashMap<SoccerData, Integer> sortedMap =
                unsorted.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        return sortedMap;
    }
}