package io.github.cadnunsdimir.android.exerciciologin.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Button(onclick: ()-> Unit, text: String){
    Button(onclick) {
        Text(text)
    }
}