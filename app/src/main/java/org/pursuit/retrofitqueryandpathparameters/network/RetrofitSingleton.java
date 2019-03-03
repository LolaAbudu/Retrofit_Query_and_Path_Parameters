package org.pursuit.retrofitqueryandpathparameters.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitSingleton {

    private static final String BASE_URL = "http://numbersapi.com/";

    private static Retrofit oneInstance;

    public static Retrofit getInstance(){
        if(oneInstance != null){
            return oneInstance;
        }
        oneInstance = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return oneInstance;
    }

    private RetrofitSingleton(){}
}
