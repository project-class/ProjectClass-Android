package com.st17.workclass.ui.screens.auth

import com.st17.workclass.model.userManager.UserManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class AuthViewModel @Inject constructor(val userManager: UserManager) {

    private val _name = MutableStateFlow("")
    val name = _name.asStateFlow()

    fun setName(name: String) {
        _name.value = name
    }

}