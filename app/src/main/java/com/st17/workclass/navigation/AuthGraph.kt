package com.st17.workclass.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.st17.workclass.ui.screens.auth.authScreen

@Composable
fun authGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = AuthGraph.Login
    ) {

    }
}

object AuthGraph {
    const val Login = "LOGIN"
    const val SignUp = "SIGN_UP"
    const val Forgot = "FORGOT"
}