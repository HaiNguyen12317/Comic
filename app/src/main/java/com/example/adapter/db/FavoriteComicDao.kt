package com.example.adapter.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.adapter.model.Comic
import com.example.adapter.model.ComicFavorite
import kotlinx.coroutines.flow.Flow


@Dao
interface FavoriteComicDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFComic(comicFavorite: ComicFavorite)

    @Update
    suspend fun updateFComic(comicFavorite: ComicFavorite)

    @Delete
    suspend fun deleteFComic(comicFavorite: ComicFavorite)

    @Query("delete from table_comic where name= :name")
    fun deleteFComicByName(name : String)

    @Query("SELECT * FROM table_comic")
    fun getAllComicFavorite():LiveData<List<ComicFavorite>>

}