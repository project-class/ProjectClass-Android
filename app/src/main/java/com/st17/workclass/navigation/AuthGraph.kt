package com.st17.workclass.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.st17.workclass.ui.screens.auth.authScreen

fun NavGraphBuilder.authGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthGraph.Login
    ) {
        composable(route = AuthGraph.Login) {
            authScreen()
        }
    }
}

object AuthGraph {
    const val Login = "LOGIN"
    const val SignUp = "SIGN_UP"
    const val Forgot = "FORGOT"
}