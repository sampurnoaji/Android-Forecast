package id.petersam.forecast.data.db.unitlocalized

interface UnitSpecificCurrentWeatherEntry {
    val cloudcover: Int
    val feelslike: Double
    val humidity: Double
    val observationTime: String
    val precip: Double
    val pressure: Double
    val temperature: Double
    val uvIndex: Int
    val visibility: Int
    val weatherCode: Int
    val weatherDescriptions: List<String>
    val weatherIcons: List<String>
    val windDegree: Double
    val windDir: String
    val windSpeed: Double
}