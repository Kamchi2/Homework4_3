package com.example.homework4_3.data.remote.interceptors

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        request = request.newBuilder()
            .header( "X-Api-Key", "8c7a81b8c1d942a89d9e87bb80a5d4dd").build()
        return chain.proceed(request)
    }
}