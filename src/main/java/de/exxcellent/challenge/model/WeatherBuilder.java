package de.exxcellent.challenge.model;

import java.util.LinkedList;
import java.util.List;

public class WeatherBuilder {

  public static  List<WeatherData> buildWeatherData(List<String> wheatherList){
      List<WeatherData> result = new LinkedList<WeatherData>();
      for (String row: wheatherList) {
          String[] splitted = row.split(",");
          Float date = Float.parseFloat(splitted[0]);
          Float mxt = Float.parseFloat(splitted[1]);
          Float mnt = Float.parseFloat(splitted[2]);

          result.add(WeatherDataFactory.createNewWeatherTestData(date,mxt,mnt));
      }
      return result;
    }
}
