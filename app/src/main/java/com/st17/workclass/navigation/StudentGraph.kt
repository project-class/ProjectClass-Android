package com.st17.workclass.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.screens.auth.studentRegScreen
import com.st17.workclass.ui.screens.student.mainStudentScreen

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

    }
}

object StudentGraph {
    const val STUDENT_MAIN = "STUDENT_MAIN"
}
