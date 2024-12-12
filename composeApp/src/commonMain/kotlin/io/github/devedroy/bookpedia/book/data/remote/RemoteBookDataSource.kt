package io.github.devedroy.bookpedia.book.data.remote

import io.github.devedroy.bookpedia.book.data.dto.SearchResponseDto
import io.github.devedroy.bookpedia.core.domain.DataError
import io.github.devedroy.bookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null,
    ): Result<SearchResponseDto, DataError.Remote>
}