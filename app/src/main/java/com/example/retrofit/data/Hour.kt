package com.example.retrofit.data

data class Hour(
    val cloudcover: Double,
    val conditions: String,
    val datetime: String,
    val datetimeEpoch: Int,
    val dew: Double,
    val feelslike: Double,
    val humidity: Double,
    val icon: String,
    val precip: Double,
    val precipprob: Double,
    val preciptype: Any,
    val pressure: Double,
    val severerisk: Double,
    val snow: Double,
    val snowdepth: Double,
    val solarenergy: Double,
    val solarradiation: Double,
    val source: String,
    val stations: List<String>,
    val temp: Double,
    val uvindex: Double,
    val visibility: Double,
    val winddir: Double,
    val windgust: Double,
    val windspeed: Double
)