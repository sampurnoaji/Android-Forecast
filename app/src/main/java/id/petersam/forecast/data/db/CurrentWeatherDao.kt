package id.petersam.forecast.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.petersam.forecast.data.db.entity.CURRENT_WEATHER_ID
import id.petersam.forecast.data.db.entity.CurrentWeatherEntry
import id.petersam.forecast.data.db.unitlocalized.ImperialCurrentWeatherEntry
import id.petersam.forecast.data.db.unitlocalized.MatrixCurrentWeatherEntry

@Dao
interface CurrentWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherEntry: CurrentWeatherEntry)

    @Query("SELECT * FROM current_weather WHERE id = $CURRENT_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MatrixCurrentWeatherEntry>

    @Query("SELECT * FROM current_weather WHERE id = $CURRENT_WEATHER_ID")
    fun getWeatherImperial(): LiveData<ImperialCurrentWeatherEntry>
}