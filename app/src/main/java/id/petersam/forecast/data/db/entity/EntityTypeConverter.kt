package id.petersam.forecast.data.db.entity

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class EntityTypeConverter {
    @TypeConverter
    fun restoreList(string: String): List<String> =
        Gson().fromJson(string, object : TypeToken<List<String>>(){}.type)

    @TypeConverter
    fun saveList(listOfString: List<String>): String =
        Gson().toJson(listOfString)

}