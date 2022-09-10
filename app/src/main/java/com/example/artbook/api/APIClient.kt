package com.example.artbook.api

import com.example.artbook.util.Util.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {

    /**
     * Retrofit nesnesini oluşturduğumuz yerdir.
     */
    private var retrofit: Retrofit? = null

   fun initRetrofitAPI(): Retrofit {
        if (retrofit == null)
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        return retrofit as Retrofit
    }

}