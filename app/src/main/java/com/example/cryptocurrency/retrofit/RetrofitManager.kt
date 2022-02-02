package com.example.cryptocurrency.retrofit
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitManager {

    val retrofitClient: Retrofit= Retrofit.Builder()
            .baseUrl("https://min-api.cryptocompare.com/data/")
            .addConverterFactory(GsonConverterFactory.create()).build()

    val services by lazy {
        retrofitClient.create(Services::class.java)
    }
    companion object{
        fun getInstance()= RetrofitManager()
    }

}