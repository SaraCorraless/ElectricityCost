package com.cys.electricitycost

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.cys.electricity.ApiLuz
import com.cys.electricitycost.navigation.AppNavigation
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent{

            AppNavigation()

        }
        //binding = ActivityMainBinding.inflate(layoutInflater)


    }

    suspend fun apiCall(): String{
        repeat(3){
            delay(2000)
            val apiLuz: ApiLuz = ApiLuz()
            var luzNowResponse = apiLuz.searchNow("PCB")
            println("Resùesta Fuera:  "+ luzNowResponse.toString())
        }


        return ""
    }


    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview(){
        AppNavigation()
    }


}

