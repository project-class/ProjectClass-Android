package com.st17.workclass.model.sharedPreferences

import android.content.Context
import javax.inject.Inject

class SharedPreferencesStorage @Inject constructor(context: Context) : Storage {

    private val sharedPreferences = context.getSharedPreferences("App", Context.MODE_PRIVATE)

    override fun setValue(key: String, value: String) {
        with(sharedPreferences.edit()) {
            putString(key, value)
            apply()
        }
    }

    override fun getValue(key: String): String {
        return sharedPreferences.getString(key, "")!!
    }
}
