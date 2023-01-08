package com.cys.electricitycost.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.cys.electricity.*
import com.cys.electricitycost.navigation.AppNavigation
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


@Composable
fun ProfileScreem(navController: NavController, apiLuz:ApiLuz){


    Scaffold {
        BodyContentProfile(navController, apiLuz)


    }

}

@Composable
fun BodyContentProfile(navController: NavController, apiLuz: ApiLuz){
    var luzNow: LuzNowResponse?
    var luzMax: LuzMaxResponse?
    var luzMin: LuzMinResponse?
    var luzMedia: LuzMediaResponse?

    runBlocking {
        luzNow = apiCallNow(apiLuz)
        luzMedia = apiCallMedia(apiLuz)
        luzMax = apiCallMax(apiLuz)
        luzMin = apiCallMin(apiLuz)
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //println("AAAAAAAAAA"+luzNowResponse.toString())
        Text(text = "Precio Luz ahora:  "+ luzNow?.price)
        Text(text = "Precio Medio de luz:  "+ luzMedia?.price)
        Text(text = "Precio Máximo de luz:  "+ luzMax?.price)
        Text(text = "Precio Mínimo de luz:  "+ luzMin?.price)

        //Text(text = "Perfil de Sara")
        /**Button(onClick = {
            //navController.navigate(route =  AppScreens.SkillsScreen.route)
            //apiLuz.searchNow("PCB")  //OK!
            //apiLuz.searchMedia("PCB") // OK!
            //apiLuz.searchAll("PCB") //OK
            //apiLuz.searchMax("PCB") // OK!
            //apiLuz.searchMin("PCB") //OK
            //apiLuz.searchMaxEcoN("PCB", "1")
        }) {
            Text(text = "Perfil")


        }*/
    }
}

suspend fun apiCallNow(apiLuz: ApiLuz): LuzNowResponse? {
    var luzNowResponse: LuzNowResponse? = null
    repeat(1){
        delay(1000)
        luzNowResponse = apiLuz.searchNow("PCB")
        println("Resùesta Fuera:  "+ luzNowResponse.toString())
    }


    return luzNowResponse
}

suspend fun apiCallMedia(apiLuz: ApiLuz): LuzMediaResponse? {
    var luzMediaResponse: LuzMediaResponse? = null
    repeat(1){
        delay(1000)
        luzMediaResponse = apiLuz.searchMedia("PCB")
        println("Resùesta Fuera:  "+ luzMediaResponse.toString())
    }


    return luzMediaResponse
}

suspend fun apiCallMax(apiLuz: ApiLuz): LuzMaxResponse? {
    var luzMaxResponse: LuzMaxResponse? = null
    repeat(1){
        delay(1000)
        luzMaxResponse = apiLuz.searchMax("PCB")
        println("Resùesta Fuera:  "+ luzMaxResponse.toString())
    }


    return luzMaxResponse
}


suspend fun apiCallMin(apiLuz: ApiLuz): LuzMinResponse? {
    var luzMinResponse: LuzMinResponse? = null
    repeat(1){
        delay(1000)
        luzMinResponse = apiLuz.searchMin("PCB")
        println("Resùesta Fuera:  "+ luzMinResponse.toString())
    }


    return luzMinResponse
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewProfile(){
    AppNavigation()
}

