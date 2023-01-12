package com.st17.workclass.ui.screens.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.user.UserInfo
import com.example.data.user.UserLogin
import com.example.data.user.UserReg
import com.st17.workclass.model.ktor.UserKtorRepository
import com.st17.workclass.model.userManager.UserManager
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class AuthViewModel @Inject constructor(
    val userManager: UserManager, private val userKtorRepository: UserKtorRepository
) : ViewModel() {

    //поля ввода
    private val _login = MutableStateFlow("")
    val login = _login.asStateFlow()
    fun setLogin(login: String) {
        _login.value = login
    }

    private val _password = MutableStateFlow("")
    val password = _password.asStateFlow()
    fun setPassword(password: String) {
        _password.value = password
    }

    private val _eduClass = MutableStateFlow("")
    val eduClass = _eduClass.asStateFlow()
    fun setEduClass(eduClass: String) {
        _eduClass.value = eduClass
    }

    //получение информации о пользователе
    private val _userInfo = MutableStateFlow<UserInfo>(UserInfo("no","","","",""))
    val userInfo = _userInfo.asStateFlow()

    fun setUserInfo(type: String){
        _userInfo.value = UserInfo(login.value,"","", eduClass.value, type)
    }

    fun updateUserInfo(){
        viewModelScope.launch (Dispatchers.IO) {

            _userInfo.value = userKtorRepository.login(UserLogin(login.value, password.value))

        }
    }

    //регистрация
    private val _answer = MutableStateFlow<String>("")
    val answer = _answer.asStateFlow()

    fun setAnswer(answer: String) {
        _answer.value = answer
    }

    fun sendUserInfo(type: String){
        viewModelScope.launch (Dispatchers.IO) {

            setAnswer(userKtorRepository.register(UserReg(login.value, password.value, eduClass.value, type)))

        }
    }

    //сохранение пользователя
    fun saveUserInfo(){
        userManager.saveUserInfo(userInfo.value)
    }

}