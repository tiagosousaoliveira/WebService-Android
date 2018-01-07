package com.app.ws.ts.wsss.WS;


import com.app.ws.ts.wsss.Model.Date;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IService {

    @GET("/addresses/zipcode/{cep}")
    Call<Date> getCep(@Path("cep") String cep);



    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://dev-cestaweb-api.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
