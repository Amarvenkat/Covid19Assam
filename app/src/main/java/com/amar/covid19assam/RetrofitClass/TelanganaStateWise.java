package com.amar.covid19assam.RetrofitClass;

import com.google.gson.annotations.SerializedName;

public class TelanganaStateWise {


   @SerializedName("Assam")
   private Telangana telangana;

   public TelanganaStateWise(Telangana telangana) {
       this.telangana = telangana;
   }

   public Telangana getTelangana() {
       return telangana;
   }

   public void setTelangana(Telangana telangana) {
       this.telangana = telangana;
   }
}
