package com.cys.electricity

import com.cys.apiservice.APIService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiLuz() {

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.preciodelaluz.org/v1/prices/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun searchByZone(query:String) : String{
        var luz:String = ""
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(APIService::class.java).getLuzNow("now", "PCB")
            luz = call.body().toString()
            if(call.isSuccessful){
                //show Recyclerview
                println(luz.toString())
            }else{
                //show error
                println("Error en petición")
            }
        }
        return luz

    }

    fun searchMedia(query:String) : String{
        var luz:String = ""
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(APIService::class.java).getLuzMedia("avg", "PCB")
            luz = call.body().toString()
            if(call.isSuccessful){
                //show Recyclerview
                println(luz.toString())
            }else{
                //show error
                println("Error en petición")
            }
        }
        return luz

    }

    fun searchAll(query:String) : String{
        var luz:String = ""
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(APIService::class.java).getLuzAll("all", "PCB")
            luz = call.body().toString()
            if(call.isSuccessful){
                //show Recyclerview
                println("bien "+luz)
            }else{
                //show error
                println("Error en petición")
            }
        }
        return luz

    }

}