package com.example.homework4_3.data.remote.apiservices

import com.example.homework4_3.data.repositorys.NewsRepository
import com.example.homework4_3.models.NewsResponse
import com.example.homework4_3.models.everything.EverythingNewsModel
import com.example.homework4_3.models.sources.SourcesNewsModel
import com.example.homework4_3.models.toparticles.TopArticlesNewsModel
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface NewsApiService {

    @GET("everything")
    suspend fun fetchEverything(
        @Query("q") query: String,
        @Header("X-Api-Key") key: String = "8c7a81b8c1d942a89d9e87bb80a5d4dd"
    ): NewsResponse<EverythingNewsModel>

    @GET("top-headlines")
    suspend fun fetchTopArticles(
        @Query("country") country: String,
        @Header("X-Api-Key") key: String = "8c7a81b8c1d942a89d9e87bb80a5d4dd"
    ): NewsResponse<TopArticlesNewsModel>

    @GET("top-headlines/sources")
    suspend fun fetchSources(
        @Header("apiKey") k: String = "API_KEY",
        @Header("X-Api-Key") key: String = "8c7a81b8c1d942a89d9e87bb80a5d4dd"
    ): NewsResponse<SourcesNewsModel>
}