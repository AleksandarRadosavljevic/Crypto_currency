package com.example.cryptocurrency.model

import com.google.gson.annotations.SerializedName

class Taxonomy (
        @SerializedName("Access")
        val access:String,
        @SerializedName("FCA")
        val fca:String,
        @SerializedName("FINMA")
        val finma:String,
        @SerializedName("Industry")
        val industry:String,
        @SerializedName("CollateralizedAsset")
        val collateralizedAsset:String,
        @SerializedName("CollateralizedAssetType")
        val collateralizedAssetType:String,
        @SerializedName("CollateralType")
        val collateralType:String,
        @SerializedName("CollateralInfo")
        val collateralInfo:String
        )

