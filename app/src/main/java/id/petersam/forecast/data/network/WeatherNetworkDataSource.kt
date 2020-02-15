package id.petersam.forecast.data.network

import androidx.lifecycle.LiveData
import id.petersam.forecast.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        language: String
    )
}