package com.st17.workclass.model.userManager

import com.example.data.user.UserInfo
import com.st17.workclass.model.sharedPreferences.Storage
import com.st17.workclass.model.sharedPreferences.UserPreferences.USER_EDU_CLASS
import com.st17.workclass.model.sharedPreferences.UserPreferences.USER_LAST_NAME
import com.st17.workclass.model.sharedPreferences.UserPreferences.USER_LOGIN
import com.st17.workclass.model.sharedPreferences.UserPreferences.USER_FIRST_NAME
import com.st17.workclass.model.sharedPreferences.UserPreferences.USER_TYPE
import javax.inject.Inject


class UserManager @Inject constructor(
    private val storage: Storage,
) {
    fun saveUserInfo(userInfo: UserInfo) {
        storage.setValue(USER_LOGIN, userInfo.login)
        storage.setValue(USER_TYPE, userInfo.type)
        storage.setValue(USER_FIRST_NAME, userInfo.firstName)
        storage.setValue(USER_LAST_NAME, userInfo.lastName)
        storage.setValue(USER_EDU_CLASS, userInfo.eduClass)
    }

    fun deleteUserInfo(){
        storage.setValue(USER_LOGIN, "")
        storage.setValue(USER_TYPE, "")
        storage.setValue(USER_FIRST_NAME, "")
        storage.setValue(USER_LAST_NAME, "")
        storage.setValue(USER_EDU_CLASS, "")
    }

    fun getUserInfo(): UserInfo {
        return UserInfo(
            storage.getValue(USER_LOGIN),
            storage.getValue(USER_TYPE),
            storage.getValue(USER_FIRST_NAME),
            storage.getValue(USER_LAST_NAME),
            storage.getValue(USER_EDU_CLASS),
        )
    }

    fun getUserLogin(): String{
        return storage.getValue(USER_LOGIN)
    }

    fun getUserType(): String{
        return storage.getValue(USER_TYPE)
    }
}