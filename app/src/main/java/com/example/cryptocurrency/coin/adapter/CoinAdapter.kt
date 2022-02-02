package com.example.cryptocurrency.coin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptocurrency.coin.holder.CoinHolder
import com.example.cryptocurrency.R
import com.example.cryptocurrency.model.CoinDetails

class CoinAdapter(val lista:List<CoinDetails>, val onClickListener: (CoinDetails) -> Unit):RecyclerView.Adapter<CoinHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinHolder {
        return CoinHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_element, parent, false))
    }

    override fun onBindViewHolder(holder: CoinHolder, position: Int) {
        holder.setData(lista[position])
        holder.itemView.setOnClickListener{
            onClickListener(lista[position])
        }

    }

    override fun getItemCount(): Int {
        return lista.size
    }
}