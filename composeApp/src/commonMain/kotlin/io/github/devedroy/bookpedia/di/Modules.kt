package io.github.devedroy.bookpedia.di

import io.github.devedroy.bookpedia.book.data.remote.KtorRemoteBookDataSource
import io.github.devedroy.bookpedia.book.data.remote.RemoteBookDataSource
import io.github.devedroy.bookpedia.book.data.repository.DefaultBookRepository
import io.github.devedroy.bookpedia.book.domain.BookRepository
import io.github.devedroy.bookpedia.book.presentation.book_list.BookListViewModel
import io.github.devedroy.bookpedia.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    viewModelOf(::BookListViewModel)
}