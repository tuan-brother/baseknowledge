package com.example.data.repositoty

interface UserRepository {
    suspend fun getUUID(): String?
}