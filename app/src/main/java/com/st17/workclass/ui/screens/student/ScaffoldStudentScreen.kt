package com.st17.workclass.ui.screens.student

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.navigation.studentGraph

@Composable
fun scaffoldStudentScreen(){
    val navController = rememberNavController()

    Scaffold(
        content = { studentGraph(navController) },
        bottomBar = { bottomStudentNavigationBar(navController = navController) }
    )
}