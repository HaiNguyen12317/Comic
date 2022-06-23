//package com.example.adapter.db
//
//import androidx.lifecycle.LiveData
//import androidx.room.*
//import com.example.adapter.model.Account
//
//@Dao
//interface AccountDao {
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertAccount(account: Account)
//
//    @Update
//    suspend fun updateAccount(account: Account)
//
//    @Query("delete from account where id = :id")
//    suspend fun deleteById(id: Int)
//
//    @Query("select * from account")
//    suspend fun getAllAccount()
//
//    @Query("select * from account")
//    fun getAllAccountWithLiveData(): LiveData<List<Account>>
//}