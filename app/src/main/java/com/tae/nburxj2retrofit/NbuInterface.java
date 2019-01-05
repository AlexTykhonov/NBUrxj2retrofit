package com.tae.nburxj2retrofit;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NbuInterface {

        String BASE_URL = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";
        @GET()
      //  Observable<PojoNbu> getNbuData(@Query("json")String format);//
    Observable<PojoNbu> getNbuData();
    }

//https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json
