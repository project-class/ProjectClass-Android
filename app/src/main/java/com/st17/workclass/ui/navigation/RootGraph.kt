package com.st17.workclass.ui.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.st17.workclass.ui.screens.student.scaffoldStudentScreen


@RequiresApi(Build.VERSION_CODES.O)
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
            scaffoldStudentScreen()
        }
    }
}

object Graph {
    const val ROOT = "ROOT"
    const val AUTHENTICATION = "AUTH"
    const val STUDENT = "STUDENT"
}