package com.st17.workclass

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.st17.workclass.data.consts.user.Type
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
            Type.student -> {
                Toast.makeText(this,userManager.getUserInfo().login, Toast.LENGTH_LONG).show()
                Toast.makeText(this,userManager.getUserInfo().type, Toast.LENGTH_LONG).show()
                Toast.makeText(this,userManager.getUserInfo().eduClass, Toast.LENGTH_LONG).show()
                Toast.makeText(this,userManager.getUserInfo().firstName, Toast.LENGTH_LONG).show()
                Toast.makeText(this,userManager.getUserInfo().lastName, Toast.LENGTH_LONG).show()
                this.startActivity(Intent(this, StudentActivity::class.java))
            }

            Type.teacher -> {
                Toast.makeText(this,userManager.getUserInfo().login, Toast.LENGTH_LONG).show()
                Toast.makeText(this,userManager.getUserInfo().type, Toast.LENGTH_LONG).show()
                Toast.makeText(this,userManager.getUserInfo().eduClass, Toast.LENGTH_LONG).show()
                Toast.makeText(this,userManager.getUserInfo().firstName, Toast.LENGTH_LONG).show()
                Toast.makeText(this,userManager.getUserInfo().lastName, Toast.LENGTH_LONG).show()
                this.startActivity(Intent(this, TeacherActivity::class.java))
            }
            else -> this.startActivity(Intent(this, AuthActivity::class.java))
        }
        finish()
    }
}
