package com.amar.covid19assam.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Tinsukia {


    @SerializedName("active")
    private  int tinsukiaactive;
    @SerializedName("confirmed")
    private  int tinsukiaconfirmed;
    @SerializedName("deceased")
    private int tinsukiadeceased;
    @SerializedName("recovered")
    private  int tinsukiarecovered;

    public Tinsukia(int tinsukiaactive, int tinsukiaconfirmed, int tinsukiadeceased, int tinsukiarecovered) {
        this.tinsukiaactive = tinsukiaactive;
        this.tinsukiaconfirmed = tinsukiaconfirmed;
        this.tinsukiadeceased = tinsukiadeceased;
        this.tinsukiarecovered = tinsukiarecovered;
    }

    public int getTinsukiaactive() {
        return tinsukiaactive;
    }

    public void setTinsukiaactive(int tinsukiaactive) {
        this.tinsukiaactive = tinsukiaactive;
    }

    public int getTinsukiaconfirmed() {
        return tinsukiaconfirmed;
    }

    public void setTinsukiaconfirmed(int tinsukiaconfirmed) {
        this.tinsukiaconfirmed = tinsukiaconfirmed;
    }

    public int getTinsukiadeceased() {
        return tinsukiadeceased;
    }

    public void setTinsukiadeceased(int tinsukiadeceased) {
        this.tinsukiadeceased = tinsukiadeceased;
    }

    public int getTinsukiarecovered() {
        return tinsukiarecovered;
    }

    public void setTinsukiarecovered(int tinsukiarecovered) {
        this.tinsukiarecovered = tinsukiarecovered;
    }
}
