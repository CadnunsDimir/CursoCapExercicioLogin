package io.github.cadnunsdimir.android.exerciciologin

import androidx.compose.runtime.Composable
import io.github.cadnunsdimir.android.exerciciologin.enums.UserType
import io.github.cadnunsdimir.android.exerciciologin.screen.AdminDashboardScreen
import io.github.cadnunsdimir.android.exerciciologin.screen.HomeScreen
import io.github.cadnunsdimir.android.exerciciologin.screen.LoginScreen
import io.github.cadnunsdimir.android.exerciciologin.screen.SplashScreen

@Composable
fun AppStateNavigation(
    isLoading: Boolean,
    isNotLogged: Boolean,
    userType: UserType,
    onLoginSuccess: (UserType) -> Unit,
    onLogout: () -> Unit
) {
    when {
        isLoading -> SplashScreen()
        isNotLogged -> LoginScreen(onLoginSuccess = onLoginSuccess)
        userType == UserType.Admin -> AdminDashboardScreen(onLogout = onLogout)
        else -> HomeScreen(onLogout = onLogout)
    }
}


