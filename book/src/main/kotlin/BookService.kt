package org.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookService

fun main(args: Array<String>) {
    runApplication<BookService>(*args)
}