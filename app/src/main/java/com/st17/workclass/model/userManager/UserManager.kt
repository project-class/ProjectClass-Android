package com.st17.workclass.model.userManager

import com.st17.workclass.model.sharedPreferences.Storage
import com.st17.workclass.model.sharedPreferences.UserPreferences.USER_ID
import com.st17.workclass.model.sharedPreferences.UserPreferences.USER_PASSWORD
import com.st17.workclass.model.sharedPreferences.UserPreferences.USER_TYPE
import javax.inject.Inject


class UserManager @Inject constructor(
    private val storage: Storage,
) {
    fun registerUser(username: String, password: String, type: String) {
        storage.setValue(USER_ID, username)
        storage.setValue(USER_PASSWORD, password)
        storage.setValue(USER_TYPE, type)
    }

    fun logoutUser(){
        storage.setValue(USER_ID, "")
        storage.setValue(USER_PASSWORD, "")
        storage.setValue(USER_TYPE, "")
    }

    fun getUserId(): String{
        return storage.getValue(USER_ID)
    }

    fun getUserPassword(): String{
        return storage.getValue(USER_PASSWORD)
    }

    fun getUserType(): String{
        return storage.getValue(USER_TYPE)
    }
}