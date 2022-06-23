//package com.example.adapter.vm
//
//import android.app.Application
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.example.adapter.db.AccountDb
//import com.example.adapter.model.Account
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//
//class AccountViewModel(private val application: Application): ViewModel() {
//    private val accountDao = AccountDb.getInstance((application.applicationContext)).getAccountDao()
//    val accounts = accountDao.getAllAccountWithLiveData()
////
//    fun addAccount(account: Account){
//        viewModelScope.launch(Dispatchers.IO) {
//            accountDao.insertAccount(account)
//        }
//
//    }
//
//    fun updateAccount(account: Account){
//        viewModelScope.launch(Dispatchers.IO) {
//            accountDao.updateAccount(account)
//        }
//
//    }
//}