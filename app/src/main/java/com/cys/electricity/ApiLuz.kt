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

    fun searchNow(query:String) : String{
        var luz:String = ""
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(APIService::class.java).getLuzNow("now", "PCB")
            luz = call.body().toString()
            if(call.isSuccessful){
                //show Recyclerview
                println("RESPUESTA OK:  "+luz)
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
                println("RESPUESTA OK:  "+luz)
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
                println("RESPUESTA OK:  "+luz)
            }else{
                //show error
                println("Error en petición")
            }
        }
        return luz

    }


    fun searchMax(query:String) : String{

        var luz:String = ""
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(APIService::class.java).getLuzMax("max", "PCB")
            luz = call.body().toString()
            if(call.isSuccessful){
                //show Recyclerview
                println("RESPUESTA OK:  "+luz)
            }else{
                //show error
                println("Error en petición")
            }
        }
        return luz

    }

    fun searchMin(query:String) : String{

        var luz:String = ""
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(APIService::class.java).getLuzMin("min", "PCB")
            luz = call.body().toString()
            if(call.isSuccessful){
                //show Recyclerview
                println("RESPUESTA OK:  "+luz)
            }else{
                //show error
                println("Error en petición")
            }
        }
        return luz

    }

    fun searchMaxEcoN(query: String, s: String) : String{

        var luz:String = ""
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(APIService::class.java).getLuzMaxEcoN("cheapests", "PCB")
            luz = call.body().toString()
            if(call.isSuccessful){
                //show Recyclerview
                println("RESPUESTA OK:  "+luz)
            }else{
                //show error
                println("Error en petición")
            }
        }
        return luz

    }

}