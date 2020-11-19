package com.poran.forecastmvvmcoroutine.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.poran.forecastmvvmcoroutine.data.api.ApiHelper
import com.poran.forecastmvvmcoroutine.data.repository.MainRepository
import com.poran.forecastmvvmcoroutine.ui.main.viewModel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}