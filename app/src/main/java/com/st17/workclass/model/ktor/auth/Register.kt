package com.st17.workclass.model.ktor.auth

import com.example.data.user.UserReg
import com.st17.workclass.data.consts.urls.Urls
import com.st17.workclass.model.ktor.KtorClient
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.coroutines.coroutineScope

class Register {
    suspend fun register(userReg: UserReg, ktorClient: KtorClient): String = coroutineScope{
        return@coroutineScope ktorClient.client.get(Urls.regUrl){
            contentType(ContentType.Application.Json)
            setBody(userReg)
        }.bodyAsText()
    }
}

suspend fun main() {
    println(Register().register(UserReg(login="login21", password = "password", eduClass = "5f", type = "student"), KtorClient()))
}