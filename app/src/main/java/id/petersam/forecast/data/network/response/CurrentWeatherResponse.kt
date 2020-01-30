package id.petersam.forecast.data.network.response


import com.google.gson.annotations.SerializedName
import id.petersam.forecast.data.db.entity.CurrentWeatherEntry
import id.petersam.forecast.data.db.entity.Location

data class CurrentWeatherResponse(
    @SerializedName("current")
    val current: CurrentWeatherEntry,
    @SerializedName("location")
    val location: Location,
    @SerializedName("request")
    val request: Request
) {
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