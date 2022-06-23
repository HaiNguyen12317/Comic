package com.example.adapter.responsity

import com.example.adapter.model.Chapter
import com.example.adapter.model.Comic

interface IComicRepository {
    suspend fun getAllComic(link: String): Comic

    suspend fun getAllChapter(link: String): Chapter
}