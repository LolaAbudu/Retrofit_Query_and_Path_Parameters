package org.pursuit.retrofitqueryandpathparameters.network;

import org.pursuit.retrofitqueryandpathparameters.model.Number;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NumberService {
    String ANIMAL_END_POINT = "{number}/math?json";

    @GET(ANIMAL_END_POINT)
    Call<Number> getNumber(@Path("number") String number);
}

//Example
//  @GET("api/films/{filmOrder}/?format=json")
//    Call<StarWarsMovie> getMovieData(@Path("filmOrder") String filmOrder);