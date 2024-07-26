package org.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PaymentService

fun main(args: Array<String>) {
    runApplication<PaymentService>(*args)
}