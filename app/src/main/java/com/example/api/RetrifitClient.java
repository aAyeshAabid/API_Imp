package com.example.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrifitClient {
    private  static  final  String base_url="https://jsonplaceholder.typicode.com/";
    private  static Retrofit retrofit= null;
    public static apiInterface getRetrofitClient(){

        if ( retrofit == null){
            retrofit = new  Retrofit.Builder().baseUrl(base_url).
                    addConverterFactory(GsonConverterFactory.create()).
                    build();


        }
        return  retrofit.create(apiInterface.class);

    }

}
