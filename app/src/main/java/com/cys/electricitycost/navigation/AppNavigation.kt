package com.cys.electricitycost.navigation

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cys.electricitycost.screens.ProfileScreem
import com.cys.electricitycost.screens.SkillsScreem

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation {
                var luzDia by remember { mutableStateOf(true) }
                var horas by remember { mutableStateOf(false) }

                BottomNavigationItem(selected = luzDia,
                    onClick = {
                        luzDia = true
                        horas = false
                        navController.navigate(AppScreens.ProfileScreen.route)
                    },
                    icon = { Icon(Icons.Default.Info, contentDescription = null) },
                    label = {
                        Text(text = "LuzDia")
                    }
                )
                BottomNavigationItem(selected = horas,
                    onClick = {
                        luzDia = false
                        horas = true
                        navController.navigate(AppScreens.SkillsScreen.route)
                    },
                    icon = { Icon(Icons.Default.Info, contentDescription = null) },
                    label = {
                        Text(text = "Hora")
                    }
                )

            }
        }
    ) {
        NavHost(navController = navController, startDestination = AppScreens.ProfileScreen.route) {
            composable(AppScreens.ProfileScreen.route) {
                ProfileScreem(navController)
            }
            composable(AppScreens.SkillsScreen.route) {
                SkillsScreem(navController)
            }

        }
    }
}