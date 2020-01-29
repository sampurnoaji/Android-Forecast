package id.petersam.forecast.data.response


import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    @SerializedName("current")
    val current: CurrentWeatherEntry,
    @SerializedName("location")
    val location: Location,
    @SerializedName("request")
    val request: Request
) {
    data class CurrentWeatherEntry(
        @SerializedName("cloudcover")
        val cloudcover: Int,
        @SerializedName("feelslike")
        val feelslike: Int,
        @SerializedName("humidity")
        val humidity: Int,
        @SerializedName("is_day")
        val isDay: String,
        @SerializedName("observation_time")
        val observationTime: String,
        @SerializedName("precip")
        val precip: Int,
        @SerializedName("pressure")
        val pressure: Int,
        @SerializedName("temperature")
        val temperature: Int,
        @SerializedName("uv_index")
        val uvIndex: Int,
        @SerializedName("visibility")
        val visibility: Int,
        @SerializedName("weather_code")
        val weatherCode: Int,
        @SerializedName("weather_descriptions")
        val weatherDescriptions: List<String>,
        @SerializedName("weather_icons")
        val weatherIcons: List<String>,
        @SerializedName("wind_degree")
        val windDegree: Int,
        @SerializedName("wind_dir")
        val windDir: String,
        @SerializedName("wind_speed")
        val windSpeed: Int
    )

    data class Location(
        @SerializedName("country")
        val country: String,
        @SerializedName("lat")
        val lat: String,
        @SerializedName("localtime")
        val localtime: String,
        @SerializedName("localtime_epoch")
        val localtimeEpoch: Int,
        @SerializedName("lon")
        val lon: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("region")
        val region: String,
        @SerializedName("timezone_id")
        val timezoneId: String,
        @SerializedName("utc_offset")
        val utcOffset: String
    )

    data class Request(
        @SerializedName("language")
        val language: String,
        @SerializedName("query")
        val query: String,
        @SerializedName("type")
        val type: String,
        @SerializedName("unit")
        val unit: String
    )
}