package com.example.adapter.network


import com.example.adapter.model.Comic
import retrofit2.http.GET
import retrofit2.http.Query

interface ComicApi {

    @GET("everything")
    suspend fun getNews(
        @Query("q") q: String,
        @Query("sortBy") sortBy: String,
        @Query("apiKey") apiKey: String,
    ):Comic
}