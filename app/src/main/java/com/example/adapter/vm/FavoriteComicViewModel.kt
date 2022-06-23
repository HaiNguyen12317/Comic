package com.example.adapter.vm

import android.app.Application

import androidx.lifecycle.ViewModel
import com.example.adapter.db.FavoriteComicDatabase
import com.example.adapter.model.ComicFavorite

class FavoriteComicViewModel(app: Application) : ViewModel() {
    private val fcomicDao = FavoriteComicDatabase.getInstance(app).getFComicDao()
    val fcomics = fcomicDao.getAllComicFavorite()

    suspend fun addFComic(fcomic: ComicFavorite){
        fcomicDao.insertFComic(fcomic)
    }
    suspend fun deleteFComic(fcomic: ComicFavorite){
        fcomicDao.deleteFComic(fcomic)
    }
    suspend fun updateFComic(fcomic: ComicFavorite){
        fcomicDao.updateFComic(fcomic)
    }
}