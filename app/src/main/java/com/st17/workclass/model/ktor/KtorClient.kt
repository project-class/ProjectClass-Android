package com.st17.workclass.model.ktor

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import javax.inject.Inject


class KtorClient {
    val client: HttpClient

    init {
        client = HttpClient(CIO){
            install(ContentNegotiation){
                json(Json {
                    prettyPrint = true
                    isLenient = true
                })
            }
        }
    }
}

