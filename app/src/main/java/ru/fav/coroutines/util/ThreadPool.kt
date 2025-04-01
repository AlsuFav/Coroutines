package ru.fav.coroutines.util

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

enum class ThreadPool (val dispatcher: CoroutineDispatcher) {
    DEFAULT(Dispatchers.Default),
    IO(Dispatchers.IO),
    MAIN(Dispatchers.Main),
    UNCONFINED(Dispatchers.Unconfined)
}