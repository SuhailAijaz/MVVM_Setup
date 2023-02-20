package com.example.mvvmsetup.`interface`

import android.telecom.Call
import com.example.mvvmsetup.modalclass.Movies
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET("popular")
    fun getPopularMovies(@Query("api_key") apikey:String): retrofit2.Call<Movies>
}