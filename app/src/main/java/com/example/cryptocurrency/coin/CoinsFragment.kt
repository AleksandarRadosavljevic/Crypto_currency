package com.example.cryptocurrency.coin

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.cryptocurrency.coin.adapter.CoinAdapter
import com.example.cryptocurrency.R
import com.example.cryptocurrency.databinding.CoinsFragmentBinding
import com.example.cryptocurrency.model.CoinDetails

class CoinsFragment : Fragment() {

    lateinit var viewModel: CoinsViewModel
    lateinit var viewBinding: CoinsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding= CoinsFragmentBinding.inflate(layoutInflater)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(CoinsViewModel::class.java)

    }

    override fun onStart() {
        super.onStart()
        observeLiveData()
        viewModel.getCoin()
    }

    fun observeLiveData(){
        viewModel.coinDataList.observe(viewLifecycleOwner){
            viewBinding.recycleView.adapter = CoinAdapter(it, ::toCoinDetails)
        }

    }
    fun toCoinDetails(coinDetails: CoinDetails) {
        val bundle = Bundle()
        bundle.putSerializable("CRYPTOCURRENCY", coinDetails)
        findNavController().navigate(R.id.action_coinsFragment_to_coinDetailsFragment, bundle)
    }

}