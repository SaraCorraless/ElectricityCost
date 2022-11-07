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
import com.cys.electricitycost.navigation.AppNavigation
import com.cys.electricitycost.navigation.AppScreens


@Composable
fun ProfileScreem(navController: NavController){
    Scaffold {
        BodyContentProfile(navController)


    }
}

@Composable
fun BodyContentProfile(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Perfil de Sara")
        Button(onClick = {
            navController.navigate(route =  AppScreens.SkillsScreen.route)
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
