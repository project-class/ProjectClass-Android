package com.example.data.user

import kotlinx.serialization.Serializable

@Serializable
data class UserLogin(
    var login: String,
    var password: String
)
