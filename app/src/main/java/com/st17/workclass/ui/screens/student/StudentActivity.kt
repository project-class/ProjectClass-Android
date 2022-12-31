package com.st17.workclass.ui.screens.student

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.st17.workclass.ui.background.mainBackground
import com.st17.workclass.ui.navigation.rootGraph
import com.st17.workclass.ui.navigation.studentGraph
import com.st17.workclass.ui.theme.WorkClassTheme


class StudentActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            WorkClassTheme {
                rememberSystemUiController().setStatusBarColor(
                    Color.Transparent, darkIcons = MaterialTheme.colors.isLight)

                Surface(modifier = Modifier.fillMaxSize()) {
                    studentGraph()
                }
            }
        }

        val settings = getSharedPreferences("PreferencesName", MODE_PRIVATE)
    }
}


