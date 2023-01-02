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
import com.st17.workclass.model.sharedPreferences.UserPreferences
import com.st17.workclass.model.sharedPreferences.UserPreferences.USER_STUDENT
import com.st17.workclass.model.sharedPreferences.UserPreferences.USER_TEACHER
import com.st17.workclass.model.userManager.UserManager
import com.st17.workclass.ui.background.mainBackground
import com.st17.workclass.ui.screens.auth.AuthActivity
import com.st17.workclass.ui.screens.student.StudentActivity
import com.st17.workclass.ui.screens.teacher.TeacherActivity
import com.st17.workclass.ui.theme.WorkClassTheme
import javax.inject.Inject


class MainActivity : ComponentActivity() {

    @Inject
    lateinit var userManager: UserManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as MainApp).appComponent.inject(this)

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
        intentActivity()
    }

    private fun intentActivity(){
        when(userManager.getUserType()){
            USER_STUDENT -> this.startActivity(Intent(this, StudentActivity::class.java))
            USER_TEACHER -> this.startActivity(Intent(this, TeacherActivity::class.java))
            else -> this.startActivity(Intent(this, AuthActivity::class.java))
        }

    }
}


