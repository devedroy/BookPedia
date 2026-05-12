package io.github.devedroy.bookpedia

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.devedroy.bookpedia.book.domain.Book
import io.github.devedroy.bookpedia.book.presentation.book_list.BookListScreen
import io.github.devedroy.bookpedia.book.presentation.book_list.BookListState
import io.github.devedroy.bookpedia.book.presentation.book_list.components.BookSearchBar

@Preview
@Composable
private fun BookSearchBarPreview() {
    MaterialTheme {
        BookSearchBar(
            searchQuery = "",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}

private val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        description = "Description $it",
        imgUrl = "https://picsum.photos/200/300",
        authors = listOf("Roy"),
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.5556,
        ratingCount = 5,
        numPages = 100,
        numEditions = 3
    )
}

@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = {}
    )
}