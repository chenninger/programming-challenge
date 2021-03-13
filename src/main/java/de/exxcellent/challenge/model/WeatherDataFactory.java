package de.exxcellent.challenge.model;

public class WeatherDataFactory {


public static WeatherData createNewWeatherData(Float Day,Float MxT,Float MnT,Float AvT,Float AvDP,Float One_HrP_TPcpn,Float PDir,Float AvSp,Float Dir,Float MxS,Float SkyC,Float MxR,Float Mn,Float R_AvSLP){
WeatherData result = new WeatherData();
result.setDay(Day);
result.setMxT(MxT);
result.setMnT(MnT);
return result;
}
    public static WeatherData createNewWeatherTestData(Float Day,Float MxT,Float MnT){
        WeatherData result = new WeatherData();
        result.setDay(Day);
        result.setMxT(MxT);
        result.setMnT(MnT);
        return result;
    }
}
