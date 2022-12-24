package com.st17.workclass.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.screens.student.mainscreen.mainStudentScreen
import com.st17.workclass.ui.screens.student.settings.settingStudentScreen

@Composable
fun studentGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        route = Graph.STUDENT,
        startDestination = StudentGraph.STUDENT_MAIN
    ) {
        composable(route = StudentGraph.STUDENT_MAIN) {
           mainStudentScreen(navController)
        }

        composable(route = StudentGraph.STUDENT_SETTING) {
            settingStudentScreen(navController)
        }
    }
}

object StudentGraph {
    const val STUDENT_MAIN = "STUDENT_MAIN"
    const val STUDENT_SETTING = "STUDENT_SETTING"
}
