package io.github.devedroy.bookpedia.book.domain

import io.github.devedroy.bookpedia.core.domain.DataError
import io.github.devedroy.bookpedia.core.domain.Result

interface BookRepository {
    suspend fun searchBooks(
        query: String
    ): Result<List<Book>, DataError.Remote>
}