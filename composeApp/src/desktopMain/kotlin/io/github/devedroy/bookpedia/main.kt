package io.github.devedroy.bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.github.devedroy.bookpedia.app.App
import io.github.devedroy.bookpedia.di.initKoin

fun main() {
    initKoin()

    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "BookPedia",
        ) {
            App()
        }
    }
}