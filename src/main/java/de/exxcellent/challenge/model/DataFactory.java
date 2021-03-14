package de.exxcellent.challenge.model;

public class DataFactory {


public static WeatherData createNewWeatherData(Float Day,Float MxT,Float MnT,Float AvT,Float AvDP,Float One_HrP_TPcpn,
                                               Float PDir,Float AvSp,Float Dir,Float MxS,Float SkyC,Float MxR,Float Mn,Float R_AvSLP){
    WeatherData result = new WeatherData();
    result.setDay(Day);
    result.setMxT(MxT);
    result.setMnT(MnT);
    result.setAvT(AvT);
    result.setAvDP(AvDP);
    result.setOne_HrP_TPcpn(One_HrP_TPcpn);
    result.setPDir(PDir);
    result.setAvSp(AvSp);
    result.setDir(Dir);
    result.setMxS(MxS);
    result.setSkyC(SkyC);
    result.setMxR(MxR);
    result.setMn(Mn);
    result.setR_AvSLP(R_AvSLP);

return result;
}
public static WeatherData createNewWeatherTestData(Float Day,Float MxT,Float MnT){
        WeatherData result = new WeatherData();
        result.setDay(Day);
        result.setMxT(MxT);
        result.setMnT(MnT);
        return result;
    }
    public static SoccerData createNewSoccerData(String Team, int Games, int Wins, int Losses, int Draws, int Goals, int Goals_Allowed, int Points){
    SoccerData result = new SoccerData();
    result.setTeam(Team);
    result.setGames(Games);
    result.setWins(Wins);
    result.setLosses(Losses);
    result.setDraws(Draws);
    result.setGoals(Goals);
    result.setGoals_Allowed(Goals_Allowed);
    return result;
    }
}
