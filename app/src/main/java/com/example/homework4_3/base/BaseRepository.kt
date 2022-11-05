package com.example.homework4_3.base

import androidx.lifecycle.liveData
import com.example.homework4_3.common.Resource
import okio.IOException

abstract class BaseRepository {

    fun <T> doRequest(result: suspend () -> T) = liveData {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(result()))
        } catch (ioException: IOException) {
            emit(Resource.Error(ioException.localizedMessage ?: "log", data = null))
        }
    }
}