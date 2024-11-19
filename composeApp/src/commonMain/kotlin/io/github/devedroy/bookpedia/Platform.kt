package io.github.devedroy.bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform