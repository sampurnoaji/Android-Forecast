package id.petersam.forecast.data.db.unitlocalized

import androidx.room.ColumnInfo

data class MatrixCurrentWeatherEntry (
    @ColumnInfo(name = "cloudcover")
    override val cloudCover: Int,
    @ColumnInfo(name = "feelslike")
    override val feelsLike: Double,
    @ColumnInfo(name = "humidity")
    override val humidity: Double,
    @ColumnInfo(name = "observationTime")
    override val observationTime: String,
    @ColumnInfo(name = "precip")
    override val precipitation: Double,
    @ColumnInfo(name = "pressure")
    override val pressure: Double,
    @ColumnInfo(name = "temperature")
    override val temperature: Double,
    @ColumnInfo(name = "uvIndex")
    override val uvIndex: Int,
    @ColumnInfo(name = "visibility")
    override val visibility: Int,
    @ColumnInfo(name = "weatherCode")
    override val weatherCode: Int,
    @ColumnInfo(name = "weatherDescriptions")
    override val weatherDescriptions: List<String>,
    @ColumnInfo(name = "weatherIcons")
    override val weatherIcons: List<String>,
    @ColumnInfo(name = "windDegree")
    override val windDegree: Double,
    @ColumnInfo(name = "windDir")
    override val windDir: String,
    @ColumnInfo(name = "windSpeed")
    override val windSpeed: Double
): UnitSpecificCurrentWeatherEntry