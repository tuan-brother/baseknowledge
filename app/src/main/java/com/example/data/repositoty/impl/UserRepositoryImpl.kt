package com.example.data.repositoty.impl

import android.content.SharedPreferences
import com.example.data.local.pref.AppPref
import com.example.data.local.pref.PrefHelper
import com.example.data.repositoty.UserRepository
import com.example.di.AppModule
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val appPref: PrefHelper
) : UserRepository {
    override suspend fun getUUID(): String? {
        return appPref.getUUID()
    }

}