package com.example.appue.presentation.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appue.presentation.auth.LoginScreen
import com.example.appue.presentation.auth.RegisterScreen
import com.example.appue.presentation.home.HomeScreen

@Composable
fun AppNavGraph(){
    val navController = rememberNavController()// este sera el archivo de rutas

    NavHost(navController = navController,
        startDestination = "register"){

        composable(route = "register"){ RegisterScreen(navController)}
        composable(route = "login"){ LoginScreen(navController)}
        composable(route = "home"){ HomeScreen()}


    }

}