package com.example.cryptocurrency.coin.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.cryptocurrency.databinding.RvElementBinding
import com.example.cryptocurrency.model.CoinDetails

class CoinHolder(item: View):RecyclerView.ViewHolder(item) {

    val binding = RvElementBinding.bind(item)

    val baseUrl = "https://www.cryptocompare.com/"

    fun setData(coinDetails: CoinDetails){
        binding.imageView.load("${baseUrl}${coinDetails.imageUrl}")
        binding.textView.text = coinDetails.fullName
    }
}