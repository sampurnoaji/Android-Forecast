package id.petersam.forecast.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import id.petersam.forecast.data.db.entity.CurrentWeatherEntry
import id.petersam.forecast.data.db.entity.EntityTypeConverter

@Database(
    entities = [CurrentWeatherEntry::class],
    version = 1
)
@TypeConverters(EntityTypeConverter::class)
abstract class ForecastDatabase : RoomDatabase() {
    abstract fun currentWeatherDao(): CurrentWeatherDao

    companion object {
        @Volatile private var intance: ForecastDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = intance ?: synchronized(LOCK) {
            intance ?: buildDatabase(context).also { intance = it }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
                ForecastDatabase::class.java, "forecast.db")
                .build()
    }
}