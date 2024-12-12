package io.github.devedroy.bookpedia

import androidx.compose.runtime.Composable
import io.github.devedroy.bookpedia.book.presentation.book_list.BookListScreenRoot
import io.github.devedroy.bookpedia.book.presentation.book_list.BookListViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun App() {
    val viewModel = koinViewModel<BookListViewModel>()
    BookListScreenRoot(
        viewModel = viewModel,
        onBookClick = {

        }
    )
}