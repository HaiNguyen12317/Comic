package com.example.adapter.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
@Entity(tableName = "table_comic")
data class ComicFavorite(

    @PrimaryKey(autoGenerate =false)
    @ColumnInfo(name = "name")
    var name: String = "",
    @ColumnInfo(name = "image")
    var image: String = "",
    @ColumnInfo(name = "link")
    var link: String = ""
)
