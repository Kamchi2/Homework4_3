package com.example.homework4_3.models.sources

import com.example.homework4_3.base.IBaseDiffModel
import com.google.gson.annotations.SerializedName

data class SourcesNewsModel(
    @SerializedName("id")
    override val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("category")
    val category: String
) : IBaseDiffModel<Int>