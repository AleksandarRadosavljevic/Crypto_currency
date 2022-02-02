package com.example.cryptocurrency.coinDetails

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cryptocurrency.model.CoinDetails

class CoinDetailsViewModel : ViewModel() {
    val cryptoDetail: MutableLiveData<CoinDetails> = MutableLiveData()
}