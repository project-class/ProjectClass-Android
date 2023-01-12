package com.st17.workclass.model.ktor

import com.example.data.user.UserInfo
import com.example.data.user.UserLogin
import com.example.data.user.UserReg
import com.st17.workclass.model.ktor.auth.Login
import com.st17.workclass.model.ktor.auth.Register
import com.st17.workclass.model.ktor.auth.UserKtor
import javax.inject.Inject

class UserKtorRepository @Inject constructor(val ktorClient: KtorClient): UserKtor{
    override suspend fun login(userLogin: UserLogin): UserInfo {
        return Login().login(userLogin, ktorClient)
    }

    override suspend fun register(userReg: UserReg): String {
        return Register().register(userReg, ktorClient)
    }
}