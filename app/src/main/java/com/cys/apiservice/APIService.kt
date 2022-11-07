package com.cys.apiservice

import com.cys.electricity.LuzMasBajaResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {

    @GET
    suspend fun getDogsByBreeds(@Url url:String): Response<LuzMasBajaResponse>
}