package com.example.homework4_3.data.remote.apiservices

import com.example.homework4_3.models.NewsResponse
import com.example.homework4_3.models.everything.EverythingNewsModel
import com.example.homework4_3.models.sources.SourcesNewsModel
import com.example.homework4_3.models.toparticles.TopArticlesNewsModel
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    @GET("everything")
    suspend fun fetchEverything(
        @Query("q") query: String
    ): NewsResponse<EverythingNewsModel>

    @GET("top-headlines")
    suspend fun fetchTopArticles(
        @Query("country") country: String
    ): NewsResponse<TopArticlesNewsModel>

    @GET("top-headlines/sources")
    suspend fun fetchSources(
    ): NewsResponse<SourcesNewsModel>
}