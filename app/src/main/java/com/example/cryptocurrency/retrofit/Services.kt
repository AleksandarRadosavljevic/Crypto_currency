package com.example.cryptocurrency.retrofit

import com.example.cryptocurrency.model.CoinData
import retrofit2.Call
import retrofit2.http.GET

interface Services {
    @GET("all/coinlist")
    fun getCoin(): Call<CoinData>
}