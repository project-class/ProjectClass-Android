package com.example.data.user

import kotlinx.serialization.Serializable

@Serializable
data class UserInfo(
    var login: String,
    var firstName: String = "YourName",
    var lastName: String = "YourLastName",
    var eduClass: String,
    var type: String
)
