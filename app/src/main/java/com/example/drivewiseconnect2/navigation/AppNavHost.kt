package com.example.drivewiseconnect2.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.drivewiseconnect2.ui.theme.pages.carrental.CarRental
import com.example.drivewiseconnect2.ui.theme.pages.dashboard.Dashboard
import com.example.drivewiseconnect2.ui.theme.pages.home.HomeScreen
import com.example.drivewiseconnect2.ui.theme.pages.login.Login
import com.example.drivewiseconnect2.ui.theme.pages.lorry.Lorry
import com.example.drivewiseconnect2.ui.theme.pages.profile.ProfileScreen
import com.example.drivewiseconnect2.ui.theme.pages.saved.Saved
import com.example.drivewiseconnect2.ui.theme.pages.settings.SettingsScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String = ROUTE_LOGIN
) {

    NavHost(
        modifier = modifier ,
        navController = navController,
        startDestination = startDestination){
        composable(ROUTE_LOGIN){
            Login(navController)
        }
        composable(ROUTE_PROFILE){
            ProfileScreen(navController)
        }
        composable(ROUTE_HOME_SCREEN){
            HomeScreen(navController)
        }
        composable(ROUTE_CAR_RENTAL){
            CarRental(navController)
        }
        composable(ROUTE_SETTINGS_SCREEN){
            SettingsScreen(navController)
        }
        composable(ROUTE_SAVED_SCREEN){
            Saved(navController)
        }
        composable(ROUTE_LORRY){
            Lorry(navController)
        }
    }
}

