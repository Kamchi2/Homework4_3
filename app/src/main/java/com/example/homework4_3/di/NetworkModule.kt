package com.example.homework4_3.di

import com.example.homework4_3.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun providePokemonApiService(retrofitClient: RetrofitClient) = retrofitClient.providePokemonApiService()

    @Singleton
    @Provides
    fun provideRetrofitClient() = RetrofitClient()

}