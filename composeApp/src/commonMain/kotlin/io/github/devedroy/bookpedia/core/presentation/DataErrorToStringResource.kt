package io.github.devedroy.bookpedia.core.presentation

import bookpedia.composeapp.generated.resources.Res
import bookpedia.composeapp.generated.resources.error_disk_full
import bookpedia.composeapp.generated.resources.error_local_unknown
import bookpedia.composeapp.generated.resources.error_no_internet_connection
import bookpedia.composeapp.generated.resources.error_remote_unknown
import bookpedia.composeapp.generated.resources.error_request_timeout
import bookpedia.composeapp.generated.resources.error_serialization
import bookpedia.composeapp.generated.resources.error_server
import bookpedia.composeapp.generated.resources.error_too_many_requests
import io.github.devedroy.bookpedia.core.domain.DataError

fun DataError.toUiText(): UiText {
    val stringRes = when (this) {
        DataError.Local.DISK_FULL -> Res.string.error_disk_full
        DataError.Local.UNKNOWN -> Res.string.error_local_unknown
        DataError.Remote.REQUEST_TIMEOUT -> Res.string.error_request_timeout
        DataError.Remote.TOO_MANY_REQUESTS -> Res.string.error_too_many_requests
        DataError.Remote.NO_INTERNET_CONNECTION -> Res.string.error_no_internet_connection
        DataError.Remote.SERVER -> Res.string.error_server
        DataError.Remote.SERIALIZATION -> Res.string.error_serialization
        DataError.Remote.UNKNOWN -> Res.string.error_remote_unknown
    }
    return UiText.StringResourceId(stringRes)
}