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
import com.cys.electricity.ApiLuz
import com.cys.electricitycost.navigation.AppNavigation


@Composable
fun ProfileScreem(navController: NavController, apiLuz:ApiLuz){

    Scaffold {
        BodyContentProfile(navController, apiLuz)


    }

}

@Composable
fun BodyContentProfile(navController: NavController, apiLuz: ApiLuz){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Text(text = "Datos ahora:  "+apiLuz.searchByZone("PCB"))
        Text(text = "Perfil de Sara")
        Button(onClick = {
            //navController.navigate(route =  AppScreens.SkillsScreen.route)
            //apiLuz.searchNow("PCB")  //OK!
            //apiLuz.searchMedia("PCB") // OK!
            //apiLuz.searchAll("PCB") //ERROR >> mal mapeo de los datos
            //apiLuz.searchMax("PCB") // OK!
            apiLuz.searchMin("PCB")
            apiLuz.searchMaxEcoN("PCB", "1")
        }) {
            Text(text = "Perfil")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewProfile(){
    AppNavigation()
}

