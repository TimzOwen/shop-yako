package com.timzowen.shopyako.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.timzowen.shopyako.component.component.GoogleButtonComponent
import com.timzowen.shopyako.shared.Alpha
import com.timzowen.shopyako.shared.FontSize
import com.timzowen.shopyako.shared.Surface
import com.timzowen.shopyako.shared.TextPrimary
import com.timzowen.shopyako.shared.TextSecondary

@Composable
fun AuthScreen() {
    // Simplified Scaffold without MessageBar wrapper to avoid iOS link error for now
    Scaffold(containerColor = Surface) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(
                    top = paddingValues.calculateTopPadding(),
                    bottom = paddingValues.calculateBottomPadding()
                )
                .fillMaxSize()
                .padding(24.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Shop Yako",
                    textAlign = TextAlign.Center,
                    fontSize = FontSize.EXTRA_LARGE,
                    color = TextSecondary
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .alpha(Alpha.HALF),
                    text = "Sign in to continue",
                    textAlign = TextAlign.Center,
                    fontSize = FontSize.EXTRA_REGULAR,
                    color = TextPrimary
                )
            }
            GoogleButtonComponent(
                loading = false,
                onClick = {}
            )
        }
    }
}
