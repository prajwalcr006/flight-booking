package com.example.myownapp.ui.theme

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class screen {

    @Composable
    fun title(modifier:Modifier = Modifier) {
        Column(
            modifier = modifier.size(2.dp)
        ) {
            Text(text = "hello")
            Text(text = "hi")
        }
    }
}