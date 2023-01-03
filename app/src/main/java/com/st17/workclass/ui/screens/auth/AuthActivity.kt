package com.st17.workclass.ui.screens.auth

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
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.st17.workclass.MainApp
import com.st17.workclass.model.userManager.UserManager
import com.st17.workclass.ui.navigation.authGraph
import com.st17.workclass.ui.theme.WorkClassTheme
import javax.inject.Inject


class AuthActivity : ComponentActivity() {

    @Inject
    lateinit var authViewModel: AuthViewModel

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as MainApp).appComponent.inject(this)



        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            WorkClassTheme {
                rememberSystemUiController().setStatusBarColor(
                    Color.Transparent, darkIcons = MaterialTheme.colors.isLight)

                Surface(modifier = Modifier.fillMaxSize()) {
                    authGraph(authViewModel = authViewModel)
                }
            }
        }
    }
}


