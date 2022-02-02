package com.example.cryptocurrency.model

import com.google.gson.annotations.SerializedName

class Weiss (
        @SerializedName("Rating")
        val rating:String,
        @SerializedName("TechnologyAdoptionRating")
        val technologyAdoptionRating:String,
        @SerializedName("MarketPerformanceRating")
        val marketPerformanceRating:String
        )
