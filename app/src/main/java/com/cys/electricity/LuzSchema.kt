package com.cys.electricity

import com.google.gson.annotations.SerializedName

data class LuzNowResponse(
    @SerializedName("date") var date: String,
    @SerializedName("hour") var hour: String,
    @SerializedName("is-cheap") var is_cheap: Boolean,
    @SerializedName("is-under-avg") var is_under_avg: Boolean,
    @SerializedName("market") var market: String,
    @SerializedName("price") var price: Float,
    @SerializedName("units") var units: String

    )

data class LuzMediaResponse(
    @SerializedName("date") var date: String,
    @SerializedName("market") var market: String,
    @SerializedName("price") var price: Float,
    @SerializedName("units") var units: String

)


data class LuzAllResponse(

    @SerializedName("date") var date: String,
    @SerializedName("hour") var hour: String,
    @SerializedName("is-cheap") var is_cheap: Boolean,
    @SerializedName("is-under-avg") var is_under_avg: Boolean,
    @SerializedName("market") var market: String,
    @SerializedName("price") var price: Float,
    @SerializedName("units") var units: String

)
