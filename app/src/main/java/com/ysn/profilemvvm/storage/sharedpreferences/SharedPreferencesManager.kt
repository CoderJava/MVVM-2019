package com.ysn.profilemvvm.storage.sharedpreferences

import android.content.SharedPreferences
import javax.inject.Inject

class SharedPreferencesManager @Inject constructor(private val sharedPreferences: SharedPreferences) {

    companion object {
        // TODO: do something in here
    }

    fun putDataInt(key: String, value: Int) = sharedPreferences.edit().putInt(key, value).apply()

    fun getDataInt(key: String, defaultValue: Int = 0) = sharedPreferences.getInt(key, defaultValue)

    fun putDataBoolean(key: String, value: Boolean) = sharedPreferences.edit().putBoolean(key, value).apply()

    fun getDataBoolean(key: String, defaultValue: Boolean = false) = sharedPreferences.getBoolean(key, defaultValue)

    fun putDataFloat(key: String, value: Float) = sharedPreferences.edit().putFloat(key, value).apply()

    fun getDataFloat(key: String, defaultValue: Float = 0F) = sharedPreferences.getFloat(key, defaultValue)

    fun putDataLong(key: String, value: Long) = sharedPreferences.edit().putLong(key, value).apply()

    fun getDataLong(key: String, defaultValue: Long = 0L) = sharedPreferences.getLong(key, defaultValue)

    fun putDataString(key: String, value: String) = sharedPreferences.edit().putString(key, value).apply()

    fun getDataString(key: String, defaultValue: String = "") = sharedPreferences.getString(key, defaultValue)

    fun clearData(key: String) = sharedPreferences.edit().remove(key).apply()

    fun clearAllData() = sharedPreferences.edit().clear().apply()

}