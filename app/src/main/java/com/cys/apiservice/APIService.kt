package com.cys.apiservice

import com.cys.electricity.*
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface APIService {

    @GET
    suspend fun getLuzNow(@Url url:String, @Query("zone") zone:String): Response<LuzNowResponse>

    @GET
    suspend fun getLuzMedia(@Url url:String, @Query("zone") zone:String): Response<LuzMediaResponse>

    @GET
    suspend fun getLuzAll(@Url url:String, @Query("zone") zone:String): Response<LuzAllResponse>

    @GET
    suspend fun getLuzMax(@Url url:String, @Query("zone") zone:String): Response<LuzMaxResponse>

    @GET
    suspend fun getLuzMin(@Url url:String, @Query("zone") zone:String): Response<LuzMinResponse>

    @GET
    suspend fun getLuzMaxEcoN(@Url url:String, @Query("zone") zone:String, @Query("n") n:String): Response<LuzMaxEcoNResponse>




}