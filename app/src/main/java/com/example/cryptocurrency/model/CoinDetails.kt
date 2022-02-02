package com.example.cryptocurrency.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CoinDetails (
        @SerializedName("Url")
    val url:String,
        @SerializedName("Id")
        val id:Int,
        @SerializedName("ImageUrl")
    val imageUrl:String,
        @SerializedName("ContentCreatedOn")
    val contentCreatedOn:Int,
        @SerializedName("Name")
    val name:String,
        @SerializedName("Symbol")
    val symbol:String,
        @SerializedName("CoinName")
    val coinName:String,
        @SerializedName("FullName")
    val fullName:String,
        @SerializedName("Description")
    val description:String,
        @SerializedName("AssetTokenStatus")
    val assetTokenStatus:String,
        @SerializedName("Algorithm")
    val algorithm:String,
        @SerializedName("ProofType")
    val proofType:String,
        @SerializedName("SortOrder")
    val sortOrder:Int,
        @SerializedName("Sponsored")
    val sponsored:Boolean,
        @SerializedName("Taxonomy")
    val taxonomy: Taxonomy,
        @SerializedName("Rating")
    val rating: Rating,
        @SerializedName("IsTrading")
    val isTrading:Boolean,
        @SerializedName("TotalCoinsMined")
    val totalCoinsMined:Float,
        @SerializedName("CirculatingSupply")
    val circulatingSupply:Float,
        @SerializedName("BlockNumber")
    val blockNumber:Float,
        @SerializedName("NetHashesPerSecond")
    val netHashesPerSecond:Float,
        @SerializedName("BlockReward")
    val blockReward:Float,
        @SerializedName("BlockTime")
    val blockTime:Float,
        @SerializedName("AssetLaunchDate")
    val assetLaunchDate:String,
        @SerializedName("AssetWhitepaperUrl")
    val assetWhitepaperUrl:String,
        @SerializedName("AssetWebsiteUrl")
    val assetWebsiteUrl:String,
        @SerializedName("MaxSupply")
    val maxSupply:Float,
        @SerializedName("MktCapPenalty")
    val mktCapPenalty:Float,
        @SerializedName("IsUsedInDefi")
    val isUsedInDefi:Float,
        @SerializedName("IsUsedInNft")
    val isUsedInNft:Float
        ) : Serializable
