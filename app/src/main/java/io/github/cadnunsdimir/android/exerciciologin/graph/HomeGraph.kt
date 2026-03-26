package io.github.cadnunsdimir.android.exerciciologin.graph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.cadnunsdimir.android.exerciciologin.screen.HomeScreen
import io.github.cadnunsdimir.android.exerciciologin.screen.ProfileScreen
import io.github.cadnunsdimir.android.exerciciologin.screen.SettingsScreen

@Composable
fun HomeGraph(onLogout: ()-> Unit) {
    val navController = rememberNavController()

    NavHost(
        navController,
        startDestination = "home"
    ){
        composable("home") {
            HomeScreen(
                onLogout = onLogout,
                onProfileClick = { navController.navigate("profile") },
                onSettingsClick = { navController.navigate("settings") }
            )
        }
        composable("profile"){
            ProfileScreen()
        }
        composable("settings"){
            SettingsScreen()
        }
    }
}