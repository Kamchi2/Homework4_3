package com.example.homework4_3.models.everything

import com.example.homework4_3.base.IBaseDiffModel
import com.google.gson.annotations.SerializedName

data class EverythingNewsModel(
    @SerializedName("id")
    override val id: Int,
    @SerializedName("title")
    val title: String
) : IBaseDiffModel<Int>
