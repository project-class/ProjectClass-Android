package com.st17.workclass.model.ktor.auth

import com.example.data.user.UserInfo
import com.example.data.user.UserLogin
import com.example.data.user.UserReg

interface UserKtor {
    suspend fun login(userLogin: UserLogin) : UserInfo

    suspend fun register(userReg: UserReg) : String
}
