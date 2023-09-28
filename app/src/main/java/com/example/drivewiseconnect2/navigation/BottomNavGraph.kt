package com.example.drivewiseconnect

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.drivewiseconnect2.navigation.BottomBarScreen
import com.example.drivewiseconnect2.ui.theme.pages.carrental.CarRental
import com.example.drivewiseconnect2.ui.theme.pages.dashboard.Dashboard
import com.example.drivewiseconnect2.ui.theme.pages.home.HomeScreen
import com.example.drivewiseconnect2.ui.theme.pages.lorry.Lorry
import com.example.drivewiseconnect2.ui.theme.pages.profile.ProfileScreen
import com.example.drivewiseconnect2.ui.theme.pages.saved.Saved
import com.example.drivewiseconnect2.ui.theme.pages.settings.SettingsScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(route =  BottomBarScreen.Home.route){
            HomeScreen(navController)
        }
        composable(route =  BottomBarScreen.Profile.route){
            ProfileScreen(navController)
        }
        composable(route =  BottomBarScreen.CarRental.route){
            CarRental(navController)
        }
        composable(route =  BottomBarScreen.Lorry.route){
            Lorry(navController)
        }
        composable(route =  BottomBarScreen.Saved.route){
            Saved(navController)
        }

    }
}