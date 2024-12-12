package io.github.devedroy.bookpedia.book.data.mappers

import io.github.devedroy.bookpedia.book.data.dto.SearchedBookDto
import io.github.devedroy.bookpedia.book.domain.Book

fun SearchedBookDto.toBook(): Book {
    return Book(
        id = id,
        title = title,
        imgUrl = if (coverKey != null) {
            "https://covers.openlibrary.org/b/olid/$coverKey-L.jpg"
        } else {
            "https://covers.openlibrary.org/b/olid/$coverAlternativeKey-L.jpg"
        },
        authors = authorNames ?: emptyList(),
        description = null,
        languages = languages ?: emptyList(),
        firstPublishYear = firstPublishYear.toString(),
        averageRating = ratingAverage,
        ratingCount = ratingsCount,
        numPages = numPagesMedian,
        numEditions = numEditions ?: 0
    )
}