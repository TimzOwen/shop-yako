package com.timzowen.shopyako

import androidx.compose.ui.window.ComposeUIViewController
import com.timzowen.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initializeKoin() }
) {
    App()
}