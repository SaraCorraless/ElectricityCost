package com.cys.electricity

import com.cys.apiservice.APIService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiLuz() {


    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.preciodelaluz.org/v1/prices/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    suspend fun searchNow(query:String) : LuzNowResponse? = withContext(Dispatchers.IO){
        var luz: LuzNowResponse?


            val call = getRetrofit().create(APIService::class.java).getLuzNow("now", "PCB")

            if(call.isSuccessful){
                //show Recyclerview
                luz = call.body()
                println("RESPUESTA OK:  "+luz.toString())
            }else{
                //show error
                luz = LuzNowResponse("", "", false, false, "", 0.0F, "")
                println("Error en petición")
            }
            println("RESPUESTA OK2:  "+luz.toString())


        return@withContext luz

    }

    suspend fun searchMedia(query:String) : LuzMediaResponse? = withContext(Dispatchers.IO){
        var luz: LuzMediaResponse?

        val call = getRetrofit().create(APIService::class.java).getLuzMedia("avg", "PCB")
        luz = call.body()
        if(call.isSuccessful){
            //show Recyclerview
            println("RESPUESTA OK:  "+luz)
        }else{
            //show error
            println("Error en petición")
        }

        return@withContext luz

    }

    fun searchAll(query:String) : String{ //TODO: falta aplicar los cambios de corrutinas para suspender la función

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


    suspend fun searchMax(query:String) : LuzMaxResponse? = withContext(Dispatchers.IO){

        var luz: LuzMaxResponse?

        val call = getRetrofit().create(APIService::class.java).getLuzMax("max", "PCB")
        luz = call.body()
        if(call.isSuccessful){
            //show Recyclerview
            println("RESPUESTA OK:  "+luz)
        }else{
            //show error
            println("Error en petición")
        }

        return@withContext luz

    }

    suspend fun searchMin(query:String) : LuzMinResponse? = withContext(Dispatchers.IO){

        var luz: LuzMinResponse?
        val call = getRetrofit().create(APIService::class.java).getLuzMin("min", "PCB")
        luz = call.body()
        if(call.isSuccessful){
            //show Recyclerview
            println("RESPUESTA OK:  "+luz)
        }else{
            //show error
            println("Error en petición")
        }

        return@withContext luz

    }

    /**fun searchMaxEcoN(query: String, s: String) : String{

        var luz:String = ""
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(APIService::class.java).getLuzMaxEcoN("cheapests", "PCB", "2")
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

    }*/

}