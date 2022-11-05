package com.example.homework4_3.models.toparticles

import com.example.homework4_3.base.IBaseDiffModel
import com.google.gson.annotations.SerializedName


data class TopArticlesNewsModel(
    @SerializedName("id")
    override val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("urlToImage")
    val image: String
) : IBaseDiffModel<Int>
