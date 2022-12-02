package com.example.retrofit.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit.data.Weather
import com.example.retrofit.repository.WeatherRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DayViewModel(private val weatherRepository: WeatherRepository):ViewModel() {
    init {
        viewModelScope.launch(Dispatchers.IO) {
            weatherRepository.getDay()
        }
    }
    val day:LiveData<Weather>
    get() = weatherRepository.day
}