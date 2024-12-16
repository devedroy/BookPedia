package io.github.devedroy.bookpedia.book.presentation.book_detail

import io.github.devedroy.bookpedia.book.domain.Book

sealed interface BookDetailAction {
    data object OnBackClick : BookDetailAction
    data object OnFavouriteClick : BookDetailAction
    data class OnSelectedBookChange(val book: Book) : BookDetailAction
}