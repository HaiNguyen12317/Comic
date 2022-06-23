//package com.example.adapter.vm
//
//import android.app.Application
//import android.widget.ViewSwitcher
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//import java.lang.IllegalArgumentException
//
//class AccountViewModelFactory(private val application: Application): ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(AccountViewModel::class.java)){
//            return AccountViewModel(application) as T
//        }
//        throw IllegalArgumentException("Unknown view model")
//    }
//}