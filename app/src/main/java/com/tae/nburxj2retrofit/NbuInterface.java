package com.tae.nburxj2retrofit;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NbuInterface {

        String BASE_URL = "https://bank.gov.ua/NBUStatService/v1/statdirectory/";
        @GET("exchange")

    Observable<PojoNbu> getNbuData(@Query("valcode") String valcode, @Query ("date") int date, @Query("")String json);
    }

//https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json
//https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=EUR&date=20190105&json
