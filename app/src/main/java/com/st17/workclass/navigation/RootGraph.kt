package com.st17.workclass.navigation

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.st17.workclass.ui.background.regBackground
import com.st17.workclass.ui.screens.auth.authScreen


@Composable
fun rootGraph(navController: NavHostController) {


    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTHENTICATION
    ) {
        composable(route = Graph.AUTHENTICATION) {
            regBackground()
        }

        composable(route = Graph.HOME) {
            authScreen()
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"
}