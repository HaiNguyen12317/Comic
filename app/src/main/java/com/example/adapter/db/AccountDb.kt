//package com.example.adapter.db
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//import com.example.adapter.model.Account
//
//@Database(entities = [Account::class],exportSchema = false,version = 1)
//abstract class AccountDb : RoomDatabase() {
//
//    abstract fun getAccountDao() : AccountDao
//
//    companion object{
//        private var instance: AccountDb? = null
//
//       @Synchronized
//        fun getInstance(context: Context): AccountDb {
//            if (instance == null){
//                instance = Room.databaseBuilder(context,
//                    AccountDb::class.java,
//                    "account.db"
//                )
//                    .build()
//            }
//           return instance!!
//
//        }
//    }
//}