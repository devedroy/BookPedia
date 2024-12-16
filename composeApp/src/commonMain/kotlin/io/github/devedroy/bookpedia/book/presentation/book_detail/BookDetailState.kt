package io.github.devedroy.bookpedia.book.presentation.book_detail

import io.github.devedroy.bookpedia.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavourite: Boolean = false,
    val book: Book? = null
)
