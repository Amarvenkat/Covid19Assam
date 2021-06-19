package com.amar.covid19assam.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Udalguri {


    @SerializedName("active")
    private  int udalguriactive;
    @SerializedName("confirmed")
    private  int udalguriconfirmed;
    @SerializedName("deceased")
    private int udalgurideceased;
    @SerializedName("recovered")
    private  int udalgurirecovered;

    public Udalguri(int udalguriactive, int udalguriconfirmed, int udalgurideceased, int udalgurirecovered) {
        this.udalguriactive = udalguriactive;
        this.udalguriconfirmed = udalguriconfirmed;
        this.udalgurideceased = udalgurideceased;
        this.udalgurirecovered = udalgurirecovered;
    }

    public int getUdalguriactive() {
        return udalguriactive;
    }

    public void setUdalguriactive(int udalguriactive) {
        this.udalguriactive = udalguriactive;
    }

    public int getUdalguriconfirmed() {
        return udalguriconfirmed;
    }

    public void setUdalguriconfirmed(int udalguriconfirmed) {
        this.udalguriconfirmed = udalguriconfirmed;
    }

    public int getUdalgurideceased() {
        return udalgurideceased;
    }

    public void setUdalgurideceased(int udalgurideceased) {
        this.udalgurideceased = udalgurideceased;
    }

    public int getUdalgurirecovered() {
        return udalgurirecovered;
    }

    public void setUdalgurirecovered(int udalgurirecovered) {
        this.udalgurirecovered = udalgurirecovered;
    }
}
