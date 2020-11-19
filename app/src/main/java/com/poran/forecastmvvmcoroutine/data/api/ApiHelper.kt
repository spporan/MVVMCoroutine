package com.poran.forecastmvvmcoroutine.data.api

class ApiHelper(private val apiService: ApiService) {
    suspend fun getUsers()=apiService.getUsers()
}