package com.st17.workclass.model.ktor.auth

import com.example.data.user.UserInfo
import com.example.data.user.UserLogin
import com.st17.workclass.data.consts.urls.Urls
import com.st17.workclass.model.ktor.KtorClient
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.coroutines.coroutineScope
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromJsonElement

class Login {
    suspend fun login(userLogin: UserLogin, ktorClient: KtorClient): UserInfo = coroutineScope{
        return@coroutineScope Json.decodeFromJsonElement<UserInfo>(
            ktorClient.client.get(Urls.loginUrl){
                contentType(ContentType.Application.Json)
                setBody(userLogin)
            }.body()
        )
    }
}
