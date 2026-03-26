package io.github.cadnunsdimir.android.exerciciologin.screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.cadnunsdimir.android.exerciciologin.components.Button

@Composable
fun AdminDashboardScreen(onLogout: () -> Unit) {
    Text("AdminDashboardScreen")
    Spacer(modifier = Modifier.height(10.dp))
    Button(onLogout,"Log Out")
}
