package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.retrofit.api.ApiInterface
import com.example.retrofit.api.ApiUtilities
import com.example.retrofit.repository.WeatherRepository
import com.example.retrofit.viewmodel.DayViewModel
import com.example.retrofit.viewmodel.DayViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var dayViewModel: DayViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apiInterface = ApiUtilities.getInstance().create(ApiInterface::class.java)
        val weatherRepository = WeatherRepository(apiInterface)
        dayViewModel = ViewModelProvider(this,DayViewModelFactory(weatherRepository)).get(DayViewModel::class.java)

        dayViewModel.day.observe(this,{
            Log.d("CAKES","onCreate: ${it.toString()}")
            Toast.makeText(this, "${it.description}", Toast.LENGTH_SHORT).show()
        })

    }
}