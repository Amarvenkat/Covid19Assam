package com.amar.covid19assam.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class SouthSalmaraMankachar {

    @SerializedName("active")
    private  int southSalmaraMankachaactive;
    @SerializedName("confirmed")
    private  int southSalmaraMankachaconfirmed;
    @SerializedName("deceased")
    private int southSalmaraMankachadeceased;
    @SerializedName("recovered")
    private  int southSalmaraMankacharecovered;

    public SouthSalmaraMankachar(int southSalmaraMankachaactive, int southSalmaraMankachaconfirmed, int southSalmaraMankachadeceased, int southSalmaraMankacharecovered) {
        this.southSalmaraMankachaactive = southSalmaraMankachaactive;
        this.southSalmaraMankachaconfirmed = southSalmaraMankachaconfirmed;
        this.southSalmaraMankachadeceased = southSalmaraMankachadeceased;
        this.southSalmaraMankacharecovered = southSalmaraMankacharecovered;
    }

    public int getSouthSalmaraMankachaactive() {
        return southSalmaraMankachaactive;
    }

    public void setSouthSalmaraMankachaactive(int southSalmaraMankachaactive) {
        this.southSalmaraMankachaactive = southSalmaraMankachaactive;
    }

    public int getSouthSalmaraMankachaconfirmed() {
        return southSalmaraMankachaconfirmed;
    }

    public void setSouthSalmaraMankachaconfirmed(int southSalmaraMankachaconfirmed) {
        this.southSalmaraMankachaconfirmed = southSalmaraMankachaconfirmed;
    }

    public int getSouthSalmaraMankachadeceased() {
        return southSalmaraMankachadeceased;
    }

    public void setSouthSalmaraMankachadeceased(int southSalmaraMankachadeceased) {
        this.southSalmaraMankachadeceased = southSalmaraMankachadeceased;
    }

    public int getSouthSalmaraMankacharecovered() {
        return southSalmaraMankacharecovered;
    }

    public void setSouthSalmaraMankacharecovered(int southSalmaraMankacharecovered) {
        this.southSalmaraMankacharecovered = southSalmaraMankacharecovered;
    }
}
