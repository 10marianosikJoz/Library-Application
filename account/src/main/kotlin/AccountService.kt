package org.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AccountService

fun main(args: Array<String>) {
    runApplication<AccountService>(*args)
}