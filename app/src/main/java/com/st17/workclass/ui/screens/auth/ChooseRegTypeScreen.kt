package com.st17.workclass.ui.screens.auth

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.model.sharedPreferences.SharedPreferencesStorage
import com.st17.workclass.model.userManager.UserManager
import com.st17.workclass.ui.navigation.AuthGraph
import com.st17.workclass.ui.background.regBackground
import com.st17.workclass.ui.elements.buttons.returnBackArrowButtonBlack
import com.st17.workclass.ui.elements.buttons.standartButton
import com.st17.workclass.ui.theme.BrownN
import com.st17.workclass.ui.theme.GreenD

@Composable
fun chooseRegTypeScreen(navController: NavHostController = rememberNavController(), authViewModel: AuthViewModel){
    regBackground()

    Column(modifier = Modifier
        .padding(top = 50.dp, start = 16.dp)) {

        returnBackArrowButtonBlack(onClick = {

            navController.popBackStack()
            navController.navigate(AuthGraph.LOGIN)
        })
    }

    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center){
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.spacedBy(20.dp)) {

            standartButton(text = "Учитель", color = BrownN, onClick = {
                navController.popBackStack()
                navController.navigate(AuthGraph.REG_TEACHER)
            })
            standartButton(text = "Ученик", color = GreenD, onClick = {
                navController.popBackStack()
                navController.navigate(AuthGraph.REG_STUDENT)
            })
        }
    }
}

@Preview
@Composable
fun previewChooseRegTypeScreen(){
    val context = LocalContext.current
    chooseRegTypeScreen(authViewModel = AuthViewModel(UserManager(storage = SharedPreferencesStorage(context))))
}