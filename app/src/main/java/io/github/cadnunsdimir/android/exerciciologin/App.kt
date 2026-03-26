package io.github.cadnunsdimir.android.exerciciologin

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import io.github.cadnunsdimir.android.exerciciologin.enums.UserType
import kotlinx.coroutines.delay

@Composable
fun App (){
    var isNotLogged by remember { mutableStateOf(true) }
    var isLoading by remember { mutableStateOf(true) }
    var userType by remember { mutableStateOf(UserType.Admin) }

    LaunchedEffect(Unit) {
        delay(3000) // Simula um carregamento de 3 segundos
        isLoading = false
    }

    AppStateNavigation(
        isLoading   = isLoading,
        isNotLogged = isNotLogged,
        userType = userType,
        onLoginSuccess = {
            loggerUserType->
            isNotLogged = false
                userType = loggerUserType },
        onLogout = { isNotLogged = true }
    )
}
