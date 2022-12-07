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
import com.cys.electricitycost.navigation.AppScreens


@Composable
fun SkillsScreem(navController: NavController, apiLuz: ApiLuz){
    Scaffold {
        BodyContentSkills(navController, apiLuz)
    }
}

@Composable
fun BodyContentSkills(navController: NavController, apiLuz: ApiLuz){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Skills de Sara")
        Button(onClick = {
            navController.navigate(route = AppScreens.ProfileScreen.route)
        }) {
            Text(text = "Skills")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewSkills(){
    AppNavigation()
}
