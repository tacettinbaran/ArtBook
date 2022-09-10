package com.example.artbook.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.artbook.R
import com.example.artbook.api.APIClient.initRetrofitAPI
import com.example.artbook.api.RetrofitAPI
import com.example.artbook.model.ImageResponse
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

/**
 * ArtFragmentFactory kullanılarak FragmentContainerView
 * içerisinde fragmentlerin gösterileceği ekran.
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var retrofitAPI: RetrofitAPI
    lateinit var imageResponse: ImageResponse

    @Inject
    lateinit var fragmentFactory: ArtFragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.fragmentFactory = fragmentFactory
        setContentView(R.layout.activity_main)
        retrofitAPI = initRetrofitAPI().create(RetrofitAPI::class.java)

        searchImage("mona")
    }


    /**
     * Retrofit kullanılarak verilerin servisten çekildiği metot
     * ImageApiFrament' taşınmalı denemek amaçlı burada çağırıldı.
     */
    fun searchImage(imageString: String) {
        var response = retrofitAPI.imageSearch(imageString)
        response.enqueue(object : Callback<ImageResponse> {
            override fun onFailure(call: Call<ImageResponse>?, t: Throwable?) {
                Log.v("mesaj_retrofit", "call failed")
            }

            override fun onResponse(call: Call<ImageResponse>?, response: Response<ImageResponse>?) {
                Log.d("mesaj", "onCreate: " + response?.body()?.hits.toString())
            }
        })
    }
}