package com.poran.forecastmvvmcoroutine.data.api

import com.poran.forecastmvvmcoroutine.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}

