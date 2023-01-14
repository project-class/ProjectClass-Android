package com.st17.workclass.ui.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.screens.student.mainscreen.StudentMainViewModel
import com.st17.workclass.ui.screens.student.mainscreen.studentLessonScreen
import com.st17.workclass.ui.screens.student.mainscreen.mainStudentScreen
import com.st17.workclass.ui.screens.student.settings.settingStudentScreen

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun studentGraph(navController: NavHostController = rememberNavController(),
                 studentMainViewModel: StudentMainViewModel) {
    NavHost(
        navController = navController,
        route = Graph.STUDENT,
        startDestination = StudentGraph.STUDENT_MAIN
    ) {
        composable(route = StudentGraph.STUDENT_MAIN) {
           mainStudentScreen(navController, studentMainViewModel)

        }

        composable(route = StudentGraph.STUDENT_SETTING) {
            settingStudentScreen(navController)
        }

        composable(route = StudentGraph.STUDENT_LESSON) {
            studentLessonScreen(navController, studentMainViewModel)
        }

    }
}

object StudentGraph {
    const val STUDENT_MAIN = "STUDENT_MAIN"
    const val STUDENT_SETTING = "STUDENT_SETTING"

    const val STUDENT_LESSON = "STUDENT_LESSON"
}