package io.github.devedroy.bookpedia.book.data.repository

import io.github.devedroy.bookpedia.book.data.mappers.toBook
import io.github.devedroy.bookpedia.book.data.remote.RemoteBookDataSource
import io.github.devedroy.bookpedia.book.domain.Book
import io.github.devedroy.bookpedia.book.domain.BookRepository
import io.github.devedroy.bookpedia.core.domain.DataError
import io.github.devedroy.bookpedia.core.domain.Result
import io.github.devedroy.bookpedia.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource,
) : BookRepository {
    override suspend fun searchBooks(
        query: String
    ): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }
}