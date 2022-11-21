package com.st17.workclass.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun rootGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTHENTICATION
    ) {
        composable(route = Graph.AUTHENTICATION) {
            authGraph()
        }

        composable(route = Graph.STUDENT) {
            studentGraph()
        }
    }
}

object Graph {
    const val ROOT = "ROOT"
    const val AUTHENTICATION = "AUTH"
    const val STUDENT = "STUDENT"
}