package com.example.adapter.vm

import android.app.Application
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

//class MainViewModelFactory(val app: FragmentActivity) : ViewModelProvider.Factory{
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//       if (modelClass.isAssignableFrom(MainViewModel::class.java)){
//           return MainViewModel(app) as T
//       }
//        throw IllegalArgumentException("unknown to create viewmodel : ${modelClass.classes} ")
//    }
//}