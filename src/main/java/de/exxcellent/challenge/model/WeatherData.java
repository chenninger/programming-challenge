package de.exxcellent.challenge.model;

import de.exxcellent.challenge.model.comparable.Comparable;

public class WeatherData implements Comparable {
    float Day;
    float MxT;
    float MnT;
    float AvT;
    float AvDP;
    float One_HrP_TPcpn;
    float PDir;
    float AvSp;
    float Dir;
    float MxS;
    float SkyC;
    float MxR;
    float Mn;

    public float getMxT() {
        return MxT;
    }

    public void setMxT(float mxT) {
        MxT = mxT;
    }

    public float getMnT() {
        return MnT;
    }

    public void setMnT(float mnT) {
        MnT = mnT;
    }

    public float getAvT() {
        return AvT;
    }

    public void setAvT(float avT) {
        AvT = avT;
    }

    public float getAvDP() {
        return AvDP;
    }

    public void setAvDP(float avDP) {
        AvDP = avDP;
    }

    public float getOne_HrP_TPcpn() {
        return One_HrP_TPcpn;
    }

    public void setOne_HrP_TPcpn(float one_HrP_TPcpn) {
        One_HrP_TPcpn = one_HrP_TPcpn;
    }

    public float getPDir() {
        return PDir;
    }

    public void setPDir(float PDir) {
        this.PDir = PDir;
    }

    public float getAvSp() {
        return AvSp;
    }

    public void setAvSp(float avSp) {
        AvSp = avSp;
    }

    public float getDir() {
        return Dir;
    }

    public void setDir(float dir) {
        Dir = dir;
    }

    public float getMxS() {
        return MxS;
    }

    public void setMxS(float mxS) {
        MxS = mxS;
    }

    public float getSkyC() {
        return SkyC;
    }

    public void setSkyC(float skyC) {
        SkyC = skyC;
    }

    public float getMxR() {
        return MxR;
    }

    public void setMxR(float mxR) {
        MxR = mxR;
    }

    public float getMn() {
        return Mn;
    }

    public void setMn(float mn) {
        Mn = mn;
    }

    public float getR_AvSLP() {
        return R_AvSLP;
    }

    public void setR_AvSLP(float r_AvSLP) {
        R_AvSLP = r_AvSLP;
    }

    float R_AvSLP;

    public float getDay() {
        return Day;
    }

    public void setDay(float day) {
        Day = day;
    }

    public int compareTo(Object object) {
        return 0;
    }
}
