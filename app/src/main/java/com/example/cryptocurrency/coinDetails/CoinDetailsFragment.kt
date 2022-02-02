package com.example.cryptocurrency.coinDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import coil.load
import com.example.cryptocurrency.databinding.CoinDetailsFragmentBinding
import com.example.cryptocurrency.model.CoinDetails

class CoinDetailsFragment : Fragment() {

    lateinit var viewModel: CoinDetailsViewModel
    lateinit var viewBinding: CoinDetailsFragmentBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewBinding= CoinDetailsFragmentBinding.inflate(layoutInflater)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(CoinDetailsViewModel::class.java)
        viewModel.cryptoDetail.value = arguments?.getSerializable("CRYPTOCURRENCY") as CoinDetails
        observeLiveData()
    }

    val URL = "https://www.cryptocompare.com/"

    fun observeLiveData(){
        viewModel.cryptoDetail.observe(viewLifecycleOwner, Observer {
            viewBinding.imageViewDetails.load("${URL}${it.imageUrl}")
            viewBinding.textViewIDDetails.text = it.id.toString()
            viewBinding.textViewContentCreatedOnDetails.text = it.contentCreatedOn.toString()
            viewBinding.textViewNameDetails.text = it.name
            viewBinding.textViewSymbolDetails.text = it.symbol
            viewBinding.textViewCoinNameDetails.text = it.coinName
            viewBinding.textViewFullNameDetails.text = it.fullName
            viewBinding.textViewDescriptionDetails.text = it.description
            viewBinding.textViewAssetTokenStatusDetails.text = it.assetTokenStatus
            viewBinding.textViewAlgorithmDetails.text = it.algorithm
            viewBinding.textViewProofTypeDetails.text = it.proofType
            viewBinding.textViewSortOrderDetails.text = it.sortOrder.toString()
            viewBinding.textViewSponsoredDetails.text = it.sponsored.toString()
            viewBinding.textViewAccessDetails.text = it.taxonomy.access
            viewBinding.textViewFCADetails.text = it.taxonomy.fca
            viewBinding.textViewFINMADetails.text = it.taxonomy.finma
            viewBinding.textViewIndustryDetails.text = it.taxonomy.industry
            viewBinding.textViewCollateralizedAssetDetails.text = it.taxonomy.collateralizedAsset
            viewBinding.textViewCollateralizedAssetTypeDetails.text = it.taxonomy.collateralizedAssetType
            viewBinding.textViewCollateralTypeDetails.text = it.taxonomy.collateralType
            viewBinding.textViewCollateralInfoDetails.text = it.taxonomy.collateralInfo
            viewBinding.textViewRatingDetails.text = it.rating.weiss.rating
            viewBinding.textViewTechnologyAdoptionRatingDetails.text = it.rating.weiss.technologyAdoptionRating
            viewBinding.textViewMarketPerformanceRatingDetails.text = it.rating.weiss.marketPerformanceRating
            viewBinding.textViewIsTradingDetails.text = it.isTrading.toString()
            viewBinding.textViewTotalCoinsMinedDetails.text = it.totalCoinsMined.toString()
            viewBinding.textViewCirculatingSupplyDetails.text = it.circulatingSupply.toString()
            viewBinding.textViewBlockNumberDetails.text = it.blockNumber.toString()
            viewBinding.textViewNetHashesPerSecondDetails.text = it.netHashesPerSecond.toString()
            viewBinding.textViewBlockRewardDetails.text = it.blockReward.toString()
            viewBinding.textViewBlockTimeDetails.text = it.blockTime.toString()
            viewBinding.textViewAssetLaunchDateDetails.text = it.assetLaunchDate
            viewBinding.textViewMaxSupplyDetails.text = it.maxSupply.toString()
            viewBinding.textViewMktCapPenaltyDetails.text = it.mktCapPenalty.toString()
            viewBinding.textViewIsUsedInDefiDetails.text = it.isUsedInDefi.toString()
            viewBinding.textViewIsUsedInNftDetails.text = it.isUsedInNft.toString()
        })
    }

}