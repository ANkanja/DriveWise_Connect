package com.example.drivewiseconnect2.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon =  Icons.Default.Home
    )
    object Profile: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon =  Icons.Default.Person
    )
    object CarRental: BottomBarScreen(
        route = "car_rental",
        title = "car_rental",
        icon =  Icons.Default.Search
    )
    object Lorry: BottomBarScreen(
        route = "lorry",
        title = "lorry",
        icon =  Icons.Default.CheckCircle
    )
    object Saved: BottomBarScreen(
        route = "saved",
        title = "saved",
        icon =  Icons.Default.FavoriteBorder
    )
}

