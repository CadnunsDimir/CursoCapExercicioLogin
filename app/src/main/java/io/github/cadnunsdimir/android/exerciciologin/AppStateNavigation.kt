package io.github.cadnunsdimir.android.exerciciologin

import androidx.compose.runtime.Composable
import io.github.cadnunsdimir.android.exerciciologin.graph.HomeGraph
import io.github.cadnunsdimir.android.exerciciologin.screen.AdminDashboardScreen
import io.github.cadnunsdimir.android.exerciciologin.screen.LoginScreen
import io.github.cadnunsdimir.android.exerciciologin.screen.SplashScreen
import io.github.cadnunsdimir.android.exerciciologin.types.UserType

@Composable
fun AppStateNavigation(
    isLoading: Boolean,
    isNotLogged: Boolean,
    userType: UserType,
    onLoginSuccess: (UserType) -> Unit,
    onLogout: () -> Unit
) {
    when{
        isLoading-> SplashScreen()
        isNotLogged-> LoginScreen(onLoginSuccess = onLoginSuccess)
        else -> {
            when (userType){
                is UserType.Admin -> AdminDashboardScreen(onLogout = onLogout)
                is UserType.User -> HomeGraph(onLogout = onLogout)
            }
        }
    }
}


