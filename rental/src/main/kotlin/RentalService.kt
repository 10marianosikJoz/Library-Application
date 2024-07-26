package org.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RentalService

fun main(args: Array<String>) {
    runApplication<RentalService>(*args)
}