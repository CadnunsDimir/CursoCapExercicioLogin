package io.github.cadnunsdimir.android.exerciciologin.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import io.github.cadnunsdimir.android.exerciciologin.components.Button
import io.github.cadnunsdimir.android.exerciciologin.types.UserType

@Composable
fun LoginScreen(onLoginSuccess: (UserType) -> Unit) {
    Column() {
        Button({ onLoginSuccess(UserType.User) },
            "Usuário")
        Button({ onLoginSuccess(UserType.Admin) },
            "Admin")
    }
}