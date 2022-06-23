package com.example.adapter.vm

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class FavoriteComicViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FavoriteComicViewModel::class.java)){
            return FavoriteComicViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown view model ")

    }
}