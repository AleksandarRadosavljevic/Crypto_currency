package com.example.cryptocurrency.coin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cryptocurrency.retrofit.RetrofitManager
import com.example.cryptocurrency.model.CoinData
import com.example.cryptocurrency.model.CoinDetails
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CoinsViewModel : ViewModel() {

    val coinDataList: MutableLiveData<List<CoinDetails>> = MutableLiveData()

    fun getCoin() {
        RetrofitManager.getInstance().services.getCoin().enqueue(object : Callback<CoinData> {
            override fun onResponse(call: Call<CoinData>, response: Response<CoinData>) {
                if (response.isSuccessful) {
                    coinDataList.value = response.body()!!.data.values.toList().sortedBy { it.sortOrder }
                }
            }

            override fun onFailure(call: Call<CoinData>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }
}




