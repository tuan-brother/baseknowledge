package com.example.data.local.pref

import android.content.SharedPreferences
import javax.inject.Inject

class AppPref @Inject constructor(
    private val sharedPreferences: SharedPreferences
) : PrefHelper {

    override suspend fun getUUID(): String? {
        return sharedPreferences.getString("UUID", "")
    }

}