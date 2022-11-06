package com.example.homework4_3.data.remote

import com.example.homework4_3.data.remote.apiservices.NewsApiService
import com.example.homework4_3.data.remote.interceptors.ApiKeyInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {

    val retrofit: Retrofit =
        Retrofit.Builder().baseUrl("https://newsapi.org/v2/").client(provideOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create()).build()

    fun provideOkHttpClient() =
        OkHttpClient().newBuilder()
            .addInterceptor(provideLoggingInterceptor())
            .addInterceptor(ApiKeyInterceptor())
            .callTimeout(30, TimeUnit.SECONDS)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS).build()

    fun provideLoggingInterceptor() =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    fun providePokemonApiService(): NewsApiService = retrofit.create(NewsApiService::class.java)
}