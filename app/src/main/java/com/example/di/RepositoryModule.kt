package com.example.di

import com.example.data.repositoty.UserRepository
import com.example.data.repositoty.impl.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun providerUserRepository(userRepositoryImpl: UserRepositoryImpl) : UserRepository = userRepositoryImpl
}