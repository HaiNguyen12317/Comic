package com.example.adapter.responsity


import com.example.adapter.model.Chapter
import com.example.adapter.model.Comic
import com.example.adapter.network.ComicApi
import com.example.adapter.until.Const
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ComicRepository @Inject constructor(
    private val api: ComicApi,

) : IComicRepository {

    override suspend fun getAllComic(q: String): Comic {
        return withContext(Dispatchers.IO){
            api.getNews(q, Const.SORT_BY,Const.API_KEY)
        }
    }

    override suspend fun getAllChapter(chap: String): Chapter {
        TODO("Not yet implemented")
    }
}