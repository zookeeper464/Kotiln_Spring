package com.example.kotlin.playground_spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PlaygroundSpringApplication

fun main(args: Array<String>) {
    runApplication<PlaygroundSpringApplication>(*args)
}
