package com.example.homework4_3.models

import com.google.gson.annotations.SerializedName

data class NewsResponse<T>(
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResult")
    val totalResult: Int,
    @SerializedName("articles")
    val articles: List<T>
)