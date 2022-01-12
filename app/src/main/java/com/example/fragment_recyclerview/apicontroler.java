package com.example.fragment_recyclerview;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apicontroler {

    private  static final String url = "https://jsonplaceholder.typicode.com/";

    private static  apicontroler clientobj;
    private static Retrofit retrofit;

    apicontroler(){

        retrofit=new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static synchronized apicontroler getInstance()
    {
        if (clientobj==null)
            clientobj=new apicontroler();
        return clientobj;
    }

    apiset getapi()
    {
        return retrofit.create(apiset.class);
    }
}
