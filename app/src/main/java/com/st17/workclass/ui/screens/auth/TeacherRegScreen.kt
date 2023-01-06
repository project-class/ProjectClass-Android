package com.st17.workclass.ui.screens.auth

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.navigation.AuthGraph
import com.st17.workclass.ui.background.regBackground
import com.st17.workclass.ui.elements.inputField.loginField
import com.st17.workclass.ui.elements.inputField.passField
import com.st17.workclass.ui.elements.buttons.confirmButton
import com.st17.workclass.ui.elements.buttons.returnBackArrowButtonBlack
import com.st17.workclass.ui.theme.BrownN

@Composable
fun teacherRegScreen(navController: NavHostController = rememberNavController(), authViewModel: AuthViewModel){
    regBackground()

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
        }
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 64.dp),
        contentAlignment = Alignment.BottomCenter){
        confirmButton(text = "Отправить", buttonColor = BrownN,
            onClick = {
                navController.popBackStack()
                navController.navigate(AuthGraph.AUTH_STUDENT)
            })
    }
}