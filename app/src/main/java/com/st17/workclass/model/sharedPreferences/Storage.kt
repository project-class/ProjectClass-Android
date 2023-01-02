package com.st17.workclass.model.sharedPreferences

interface Storage {
    fun setValue(key: String, value: String)
    fun getValue(key: String): String
}
