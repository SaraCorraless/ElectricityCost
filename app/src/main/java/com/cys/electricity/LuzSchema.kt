package com.cys.electricity

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName
import java.util.Objects

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
    //Es un objeto de objetos

    @SerializedName("00-01") var h1:LuzMaxResponse,
    @SerializedName("01-02") var h2:LuzMaxResponse,
    @SerializedName("02-03") var h3:LuzMaxResponse,
    @SerializedName("03-04") var h4:LuzMaxResponse,
    @SerializedName("04-05") var h5:LuzMaxResponse,
    @SerializedName("05-06") var h6:LuzMaxResponse,
    @SerializedName("06-07") var h7:LuzMaxResponse,
    @SerializedName("07-08") var h8:LuzMaxResponse,
    @SerializedName("08-09") var h9:LuzMaxResponse,
    @SerializedName("09-10") var h10:LuzMaxResponse,
    @SerializedName("10-11") var h11:LuzMaxResponse,
    @SerializedName("11-12") var h12:LuzMaxResponse,
    @SerializedName("12-13") var h13:LuzMaxResponse,
    @SerializedName("13-14") var h14:LuzMaxResponse,
    @SerializedName("14-15") var h15:LuzMaxResponse,
    @SerializedName("15-16") var h16:LuzMaxResponse,
    @SerializedName("16-17") var h17:LuzMaxResponse,
    @SerializedName("17-18") var h18:LuzMaxResponse,
    @SerializedName("18-19") var h19:LuzMaxResponse,
    @SerializedName("19-20") var h20:LuzMaxResponse,
    @SerializedName("20-21") var h21:LuzMaxResponse,
    @SerializedName("21-22") var h22:LuzMaxResponse,
    @SerializedName("22-23") var h23:LuzMaxResponse

)

data class LuzMaxResponse(
    @SerializedName("date") var date: String,
    @SerializedName("hour") var hour: String,
    @SerializedName("is-cheap") var is_cheap: Boolean,
    @SerializedName("is-under-avg") var is_under_avg: Boolean,
    @SerializedName("market") var market: String,
    @SerializedName("price") var price: Float,
    @SerializedName("units") var units: String

)

data class LuzMinResponse(
    @SerializedName("date") var date: String,
    @SerializedName("hour") var hour: String,
    @SerializedName("is-cheap") var is_cheap: Boolean,
    @SerializedName("is-under-avg") var is_under_avg: Boolean,
    @SerializedName("market") var market: String,
    @SerializedName("price") var price: Float,
    @SerializedName("units") var units: String

)

data class LuzMaxEcoNResponse( //es un array de objetos
    @SerializedName("date") var date: String,
    @SerializedName("hour") var hour: String,
    @SerializedName("is-cheap") var is_cheap: Boolean,
    @SerializedName("is-under-avg") var is_under_avg: Boolean,
    @SerializedName("market") var market: String,
    @SerializedName("price") var price: Float,
    @SerializedName("units") var units: String

)
