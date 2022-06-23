package com.example.adapter.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.adapter.model.ComicFavorite

@Database(entities = [ComicFavorite::class],exportSchema = false,version = 1)
abstract class FavoriteComicDatabase : RoomDatabase() {

    abstract fun getFComicDao(): FavoriteComicDao
    companion object{
        private val instance: FavoriteComicDatabase ?= null
        fun getInstance(context: Context): FavoriteComicDatabase = instance?: synchronized(this){
            Room.databaseBuilder(
                context,
                FavoriteComicDatabase::class.java,
                "fcomic.db").fallbackToDestructiveMigration()
                .build()
        }
    }


}