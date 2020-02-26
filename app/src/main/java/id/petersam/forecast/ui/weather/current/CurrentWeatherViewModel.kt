package id.petersam.forecast.ui.weather.current

import androidx.lifecycle.ViewModel
import id.petersam.forecast.data.repository.ForecastRepository
import id.petersam.forecast.internal.UnitSystem
import id.petersam.forecast.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository
) : ViewModel() {
    private val unitSystem = UnitSystem.METRIC

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }
}
