package de.exxcellent.challenge.controller;

import de.exxcellent.challenge.model.WeatherData;

import java.util.*;
import java.util.stream.Collectors;

public class AnalyseWeather {

    public static HashMap<WeatherData, Float> calculateDifference(List<WeatherData> data) {
        HashMap<WeatherData, Float> result = new HashMap<WeatherData, Float>();
        for (WeatherData dataLine : data) {
            Float diff = dataLine.getMxT() - dataLine.getMnT();
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
}