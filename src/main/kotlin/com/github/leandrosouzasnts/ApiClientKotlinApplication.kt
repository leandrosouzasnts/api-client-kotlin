package com.github.leandrosouzasnts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApiClientKotlinApplication

fun main(args: Array<String>) {
	runApplication<ApiClientKotlinApplication>(*args)
}
