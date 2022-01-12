package com.example.fragment_recyclerview;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apiset {

    @GET("posts")
    Call<List<model>> getmodel();


}
