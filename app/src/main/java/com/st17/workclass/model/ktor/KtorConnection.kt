package com.st17.workclass.model.ktor

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class KtorConnection {
}

suspend fun main() {
    val client = HttpClient(CIO)
    val response: HttpResponse = client.get("http://127.0.0.1:8080")
    println(response.status)
    client.close()
}