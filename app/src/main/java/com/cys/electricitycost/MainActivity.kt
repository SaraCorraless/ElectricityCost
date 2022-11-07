package com.cys.electricitycost

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.cys.electricitycost.navigation.AppNavigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            AppNavigation()

        }

    }


    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview(){
        AppNavigation()
    }


}

