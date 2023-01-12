package com.st17.workclass.model.ktor

import com.example.data.user.UserInfo
import com.example.data.user.UserLogin
import com.example.data.user.UserReg
import com.st17.workclass.model.ktor.auth.Login
import com.st17.workclass.model.ktor.auth.Register
import com.st17.workclass.model.ktor.auth.UserKtor
import io.ktor.client.plugins.*
import javax.inject.Inject

class UserKtorRepository @Inject constructor(val ktorClient: KtorClient): UserKtor{
    override suspend fun login(userLogin: UserLogin): UserInfo {
        return try {
            Login().login(userLogin, ktorClient)
        } catch (e: RedirectResponseException){
            // 3xx responses
            println("Error: ${e.response.status.description}")
            UserInfo("","","","","")
        }catch (e: ClientRequestException){
            // 4xx responses
            println("Error: ${e.response.status.description}")
            UserInfo("","","","","")
        }catch (e: ServerResponseException){
            // 5xx responses
            println("Error: ${e.response.status.description}")
            UserInfo("","","","","")
        }
    }

    override suspend fun register(userReg: UserReg): String {
        return try {
            Register().register(userReg, ktorClient)
        } catch (e: RedirectResponseException){
            // 3xx responses
            println("Error: ${e.response.status.description}")
            "exception 3xx responses"
        }catch (e: ClientRequestException){
            // 4xx responses
            println("Error: ${e.response.status.description}")
            "exception 4xx responses"
        }catch (e: ServerResponseException){
            // 5xx responses
            println("Error: ${e.response.status.description}")
            "exception 5xx responses"
        } catch (e: Exception){
            println("Error: ${e.message}")
            "exception"
        }
    }
}