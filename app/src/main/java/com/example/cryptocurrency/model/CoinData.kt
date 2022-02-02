package com.example.cryptocurrency.model

import com.google.gson.annotations.SerializedName

class CoinData (
        @SerializedName("Data")
        val data: HashMap<String, CoinDetails>
        )