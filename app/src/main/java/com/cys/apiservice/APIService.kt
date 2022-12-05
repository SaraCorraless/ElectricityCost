package com.cys.apiservice

import com.cys.electricity.LuzNowResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface APIService {

    @GET
    suspend fun getLuzNow(@Url url:String, @Query("zone") zone:String): Response<LuzNowResponse>
}