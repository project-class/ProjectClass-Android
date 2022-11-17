package com.st17.workclass.ui.screens.auth

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.navigation.AuthGraph
import com.st17.workclass.ui.background.regBackground
import com.st17.workclass.ui.elements.InputField.classField
import com.st17.workclass.ui.elements.InputField.loginField
import com.st17.workclass.ui.elements.InputField.passField
import com.st17.workclass.ui.elements.buttons.confirmButton
import com.st17.workclass.ui.elements.buttons.returnBackButton
import com.st17.workclass.ui.elements.buttons.standartButton
import com.st17.workclass.ui.elements.texts.titleText
import com.st17.workclass.ui.theme.BrownN
import com.st17.workclass.ui.theme.GreenD

@Preview
@Composable
fun studentRegScreen(navController: NavHostController = rememberNavController()){
    regBackground()

    Column(modifier = Modifier
        .padding(top = 50.dp, start = 16.dp)) {

        returnBackButton(navHostController = navController, graph = AuthGraph.CHOOSE_REG_TYPE)
    }

    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            loginField()
            passField()
            classField()
        }
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 64.dp),
        contentAlignment = Alignment.BottomCenter){
        confirmButton(text = "Отправить", buttonColor = BrownN,
            navHostController = navController, graph = AuthGraph.AUTH_STUDENT)
    }
}