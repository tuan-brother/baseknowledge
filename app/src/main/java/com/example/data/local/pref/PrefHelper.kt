package com.example.data.local.pref

interface PrefHelper {
    suspend fun getUUID() : String?
}