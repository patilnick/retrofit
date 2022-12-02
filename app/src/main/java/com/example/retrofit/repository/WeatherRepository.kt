package com.example.retrofit.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.retrofit.api.ApiInterface
import com.example.retrofit.data.Weather

class WeatherRepository(private val apiInterface: ApiInterface) {
    private val weatherLiveData = MutableLiveData<Weather>()
    val day: LiveData<Weather>
    get() = weatherLiveData

    suspend fun getDay(){
        val result = apiInterface.getWeather()
        if (result!= null){
            weatherLiveData.postValue(result.body())
        }
    }
}