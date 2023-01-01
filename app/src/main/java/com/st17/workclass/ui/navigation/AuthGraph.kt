package com.st17.workclass.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.screens.auth.authScreen
import com.st17.workclass.ui.screens.auth.chooseRegTypeScreen
import com.st17.workclass.ui.screens.auth.studentRegScreen
import com.st17.workclass.ui.screens.auth.teacherRegScreen
import com.st17.workclass.ui.screens.student.scaffoldStudentScreen

@Composable
fun authGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        route = Graph.AUTHENTICATION,
        startDestination = AuthGraph.LOGIN
    ) {
        composable(route = AuthGraph.LOGIN) {
            authScreen(navController)
        }

        composable(route = AuthGraph.AUTH_STUDENT) {
        }

        composable(route = AuthGraph.AUTH_TEACHER) {

        }

        composable(route = AuthGraph.CHOOSE_REG_TYPE) {
            chooseRegTypeScreen(navController)
        }

        composable(route = AuthGraph.REG_STUDENT) {
            studentRegScreen(navController)
        }

        composable(route = AuthGraph.REG_TEACHER) {
            teacherRegScreen(navController)
        }
    }
}

object AuthGraph {
    const val LOGIN = "LOGIN"
    const val AUTH_STUDENT = "AUTH_STUDENT"
    const val AUTH_TEACHER = "AUTH_TEACHER"

    const val CHOOSE_REG_TYPE = "CHOOSE_REG_TYPE"
    const val REG_STUDENT = "REG_STUDENT"
    const val REG_TEACHER = "REG_TEACHER"
}
