package io.github.devedroy.bookpedia

import androidx.compose.ui.window.ComposeUIViewController
import io.github.devedroy.bookpedia.app.App
import io.github.devedroy.bookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(configure = {
    initKoin()
}) {
    App()
}