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
import com.st17.workclass.ui.navigation.AuthGraph
import com.st17.workclass.ui.background.regBackground
import com.st17.workclass.ui.elements.inputField.loginField
import com.st17.workclass.ui.elements.inputField.passField
import com.st17.workclass.ui.elements.buttons.confirmButton
import com.st17.workclass.ui.elements.buttons.returnBackArrowButtonBlack
import com.st17.workclass.ui.elements.inputField.classField
import com.st17.workclass.ui.screens.student.StudentActivity
import com.st17.workclass.ui.screens.teacher.TeacherActivity
import com.st17.workclass.ui.theme.BrownN

@Composable
fun teacherRegScreen(navController: NavHostController = rememberNavController(), authViewModel: AuthViewModel){
    regBackground()

    val context = LocalContext.current

    Column(modifier = Modifier
        .padding(top = 50.dp, start = 16.dp)) {

        returnBackArrowButtonBlack(onClick = {
            navController.popBackStack()
            navController.navigate(AuthGraph.CHOOSE_REG_TYPE)
        })
    }

    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            loginField(authViewModel)
            passField(authViewModel)
            classField(authViewModel)
        }
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 64.dp),
        contentAlignment = Alignment.BottomCenter){
        confirmButton(text = "Отправить", buttonColor = BrownN,
            onClick = {
                authViewModel.sendUserInfo(Type.teacher)

                for (i in 0..79){

                    if (authViewModel.answer.value == "success"){
                        authViewModel.setUserInfo(Type.teacher)
                        authViewModel.saveUserInfo()

                        context.startActivity(Intent(context, TeacherActivity::class.java))
                    }

                    Thread.sleep(50)
                }

                if(authViewModel.answer.value != "success"){
                    Toast.makeText(context, "ошибка", Toast.LENGTH_LONG).show()
                }
            })
    }
}
