package com.example.cd185134.sgpsi.services.api;

import com.example.cd185134.sgpsi.models.PSI;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * api endpoint collection
 * Created by cherrie on 5/23/2018.
 */

public interface Endpoint {

    @GET("environment/psi")
    Call<PSI> getPsi(@Query("date_time") String dateTime, @Query("date") String date);

}
