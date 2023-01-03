package com.st17.workclass.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.screens.auth.*

@Composable
fun authGraph(navController: NavHostController = rememberNavController(),
              authViewModel: AuthViewModel) {
    NavHost(
        navController = navController,
        route = Graph.AUTHENTICATION,
        startDestination = AuthGraph.LOGIN
    ) {
        composable(route = AuthGraph.LOGIN) {
            authScreen(navController, authViewModel)
        }

        composable(route = AuthGraph.AUTH_STUDENT) {
        }

        composable(route = AuthGraph.AUTH_TEACHER) {

        }

        composable(route = AuthGraph.CHOOSE_REG_TYPE) {
            chooseRegTypeScreen(navController, authViewModel)
        }

        composable(route = AuthGraph.REG_STUDENT) {
            studentRegScreen(navController, authViewModel)
        }

        composable(route = AuthGraph.REG_TEACHER) {
            teacherRegScreen(navController, authViewModel)
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
