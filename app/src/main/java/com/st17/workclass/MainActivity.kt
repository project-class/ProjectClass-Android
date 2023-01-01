package com.st17.workclass

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.st17.workclass.ui.background.mainBackground
import com.st17.workclass.ui.screens.student.StudentActivity
import com.st17.workclass.ui.theme.WorkClassTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            WorkClassTheme {
                rememberSystemUiController().setStatusBarColor(
                    Color.Transparent, darkIcons = MaterialTheme.colors.isLight)

                Surface(modifier = Modifier.fillMaxSize()) {
                    mainBackground()
                }
            }
        }

        this.startActivity(Intent(this, StudentActivity::class.java))

        val settings = getSharedPreferences("PreferencesName", MODE_PRIVATE)
    }
}


