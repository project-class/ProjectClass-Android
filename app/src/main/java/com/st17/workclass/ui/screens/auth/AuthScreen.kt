package com.st17.workclass.ui.screens.auth

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.data.consts.user.Type
import com.st17.workclass.model.sharedPreferences.SharedPreferencesStorage
import com.st17.workclass.model.sharedPreferences.UserPreferences
import com.st17.workclass.model.userManager.UserManager
import com.st17.workclass.ui.navigation.AuthGraph
import com.st17.workclass.ui.background.authBackground
import com.st17.workclass.ui.elements.inputField.loginField
import com.st17.workclass.ui.elements.inputField.passField
import com.st17.workclass.ui.elements.buttons.standartButton
import com.st17.workclass.ui.elements.texts.titleText
import com.st17.workclass.ui.screens.student.StudentActivity
import com.st17.workclass.ui.screens.teacher.TeacherActivity
import com.st17.workclass.ui.theme.BrownN
import com.st17.workclass.ui.theme.GreenD
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@Composable
fun authScreen(navController: NavHostController = rememberNavController(), authViewModel: AuthViewModel){
    authBackground()

    val context = LocalContext.current

    Box(modifier = Modifier
        .fillMaxSize(),
    contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier
                .padding(bottom = 120.dp),
            verticalArrangement = Arrangement.spacedBy(29.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            titleText("Вход")
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.spacedBy(20.dp)) {

                loginField(authViewModel)
                passField(authViewModel)

                Row(modifier = Modifier
                    .padding(top = 6.dp, start = 6.dp, end = 6.dp),
                    horizontalArrangement = Arrangement.spacedBy(22.dp),
                ) {
                    standartButton(text = "Регистрация", color = BrownN, onClick = {
                        navController.popBackStack()
                        navController.navigate(AuthGraph.CHOOSE_REG_TYPE)
                    })

                    standartButton(text = "Вход", color = GreenD) {
                        authViewModel.updateUserInfo()

                        for (i in 0..29){

                            if (authViewModel.userInfo.value.type != ""){
                                break
                            }
                            Thread.sleep(100)
                        }

                        when(authViewModel.userInfo.value.type){
                            Type.student -> {
                                authViewModel.saveUserInfo()
                                context.startActivity(Intent(context, StudentActivity::class.java))
                            }

                            Type.teacher -> {
                                authViewModel.saveUserInfo()
                                context.startActivity(Intent(context, TeacherActivity::class.java))
                            }

                            else -> Toast.makeText(context, "ошибка входа", Toast.LENGTH_LONG).show()
                        }

                    }
                }
            }
        }
    }
}
