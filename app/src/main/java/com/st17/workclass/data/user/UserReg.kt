package com.example.data.user

import kotlinx.serialization.Serializable

@Serializable
data class UserReg(
    var login: String,
    var password: String,
    var eduClass: String,
    var type: String
)
