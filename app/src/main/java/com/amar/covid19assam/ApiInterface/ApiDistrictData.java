package com.amar.covid19assam.ApiInterface;

import com.amar.covid19assam.RetrofitClass.TelanganaStateWise;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiDistrictData {

    @GET("state_district_wise.json")
    Call<TelanganaStateWise> getDistrictData();

}
