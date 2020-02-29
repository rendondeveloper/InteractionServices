package com.example.rendondev.firsthomework;

import com.example.rendondev.firsthomework.Response.response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ServicesColor {
    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @GET("id?hex={color]}")
    Call<response> GetColor(@Path("color") String color);
}
