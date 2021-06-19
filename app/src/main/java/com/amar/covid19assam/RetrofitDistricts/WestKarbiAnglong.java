package com.amar.covid19assam.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class WestKarbiAnglong {


    @SerializedName("active")
    private  int westKarbiAnglongactive;
    @SerializedName("confirmed")
    private  int westKarbiAnglongconfirmed;
    @SerializedName("deceased")
    private int westKarbiAnglongdeceased;
    @SerializedName("recovered")
    private  int westKarbiAnglongrecovered;

    public WestKarbiAnglong(int westKarbiAnglongactive, int westKarbiAnglongconfirmed, int westKarbiAnglongdeceased, int westKarbiAnglongrecovered) {
        this.westKarbiAnglongactive = westKarbiAnglongactive;
        this.westKarbiAnglongconfirmed = westKarbiAnglongconfirmed;
        this.westKarbiAnglongdeceased = westKarbiAnglongdeceased;
        this.westKarbiAnglongrecovered = westKarbiAnglongrecovered;
    }

    public int getWestKarbiAnglongactive() {
        return westKarbiAnglongactive;
    }

    public void setWestKarbiAnglongactive(int westKarbiAnglongactive) {
        this.westKarbiAnglongactive = westKarbiAnglongactive;
    }

    public int getWestKarbiAnglongconfirmed() {
        return westKarbiAnglongconfirmed;
    }

    public void setWestKarbiAnglongconfirmed(int westKarbiAnglongconfirmed) {
        this.westKarbiAnglongconfirmed = westKarbiAnglongconfirmed;
    }

    public int getWestKarbiAnglongdeceased() {
        return westKarbiAnglongdeceased;
    }

    public void setWestKarbiAnglongdeceased(int westKarbiAnglongdeceased) {
        this.westKarbiAnglongdeceased = westKarbiAnglongdeceased;
    }

    public int getWestKarbiAnglongrecovered() {
        return westKarbiAnglongrecovered;
    }

    public void setWestKarbiAnglongrecovered(int westKarbiAnglongrecovered) {
        this.westKarbiAnglongrecovered = westKarbiAnglongrecovered;
    }
}
