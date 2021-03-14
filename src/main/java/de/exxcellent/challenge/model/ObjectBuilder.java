package de.exxcellent.challenge.model;

import java.util.LinkedList;
import java.util.List;

public class ObjectBuilder {

    public static List<WeatherData> buildWeatherData(List<String> weatherList) {
        List<WeatherData> result = new LinkedList<WeatherData>();
        for (String row : weatherList) {
            String[] splitted = row.split(",");
            Float date = Float.parseFloat(splitted[0]);
            Float mxt = Float.parseFloat(splitted[1]);
            Float mnt = Float.parseFloat(splitted[2]);
            Float avt = Float.parseFloat(splitted[3]);
            Float avdb = Float.parseFloat(splitted[4]);
            Float onehrptpcpn = Float.parseFloat(splitted[5]);
            Float pdir = Float.parseFloat(splitted[6]);
            Float avsp = Float.parseFloat(splitted[7]);
            Float dir = Float.parseFloat(splitted[8]);
            Float mxs = Float.parseFloat(splitted[9]);
            Float skyc = Float.parseFloat(splitted[10]);
            Float mxr = Float.parseFloat(splitted[11]);
            Float mn = Float.parseFloat(splitted[12]);
            Float rAvslp = Float.parseFloat(splitted[13]);

            result.add(DataFactory.createNewWeatherData(date, mxt, mnt, avt, avdb, onehrptpcpn, pdir, avsp, dir, mxs, skyc, mxr, mn, rAvslp));
        }
        return result;
    }

    public static List<SoccerData> buildSoccerData(List<String> soccerList) {
        List<SoccerData> result = new LinkedList<SoccerData>();
        for (String row : soccerList) {
            String[] splitted = row.split(",");
            String team = splitted[0];
            int games = Integer.parseInt(splitted[1]);
            int wins = Integer.parseInt(splitted[2]);
            int losses = Integer.parseInt(splitted[3]);
            int draws = Integer.parseInt(splitted[4]);
            int goals = Integer.parseInt(splitted[5]);
            int goals_allowed = Integer.parseInt(splitted[6]);
            int points = Integer.parseInt(splitted[7]);

            result.add(DataFactory.createNewSoccerData(team,games,wins,losses,draws,goals,goals_allowed,points));
        }
        return result;
    }
}
