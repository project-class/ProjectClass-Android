package com.st17.workclass.ui.screens.teacher.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.background.mainBackground
import com.st17.workclass.ui.elements.texts.titleText

@Preview
@Composable
fun settingTeacherScreen(navController: NavHostController = rememberNavController()){
    mainBackground()

    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
        ) { titleText(text = "Menu") }
}
