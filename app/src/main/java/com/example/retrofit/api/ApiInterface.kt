package com.example.retrofit.api

import com.example.retrofit.data.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("VisualCrossingWebServices/rest/services/timeline/india?unitGroup=metric&key=ZUARP5LYKT4S3D3XTH6LPVDS9&contentType=json")
    suspend fun getWeather():Response<Weather>
}