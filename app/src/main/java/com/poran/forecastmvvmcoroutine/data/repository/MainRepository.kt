package com.poran.forecastmvvmcoroutine.data.repository

import com.poran.forecastmvvmcoroutine.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers()=apiHelper.getUsers()
}