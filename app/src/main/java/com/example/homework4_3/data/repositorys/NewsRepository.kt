package com.example.homework4_3.data.repositorys

import com.example.homework4_3.base.BaseRepository
import com.example.homework4_3.data.remote.apiservices.NewsApiService
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsApiService: NewsApiService): BaseRepository() {

    fun fetchEverything() = doRequest {
        newsApiService.fetchEverything("bitcoin")
    }

    fun fetchTopArticles() = doRequest {
        newsApiService.fetchTopArticles("us")
    }

    fun fetchSources() = doRequest {
        newsApiService.fetchSources()
    }
}