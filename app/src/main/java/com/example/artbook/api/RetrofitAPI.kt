package com.example.artbook.api

import com.example.artbook.model.ImageResponse
import com.example.artbook.util.Util.API_KEY
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitAPI {
    /**
     * API ile haberleşme için uygun GET, POST metodlarının yazıldığı yerdir.
     */
    @GET("/api/")
    fun imageSearch(
        @Query("q") searchQuery: String,
        @Query("key") apiKey : String = API_KEY
    ) : Call<ImageResponse>
}