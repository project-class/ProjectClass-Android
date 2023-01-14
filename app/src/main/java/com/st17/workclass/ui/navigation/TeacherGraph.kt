package com.st17.workclass.ui.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.screens.teacher.mainscreen.TeacherMainViewModel
import com.st17.workclass.ui.screens.teacher.mainscreen.mainTeacherScreen
import com.st17.workclass.ui.screens.teacher.mainscreen.marks.studentInfo
import com.st17.workclass.ui.screens.teacher.mainscreen.marks.studentList
import com.st17.workclass.ui.screens.teacher.mainscreen.teacherLessonScreen
import com.st17.workclass.ui.screens.teacher.settings.settingTeacherScreen

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun teacherGraph(navController: NavHostController = rememberNavController(),
                 teacherMainViewModel: TeacherMainViewModel
) {
    NavHost(
        navController = navController,
        route = Graph.TEACHER,
        startDestination = TeacherGraph.TEACHER_MAIN
    ) {
        composable(route = TeacherGraph.TEACHER_MAIN) {
            mainTeacherScreen(navController, teacherMainViewModel)
        }

        composable(route = TeacherGraph.TEACHER_SETTING) {
            settingTeacherScreen(navController)
        }

        composable(route = TeacherGraph.TEACHER_LESSON) {
            teacherLessonScreen(navController, teacherMainViewModel)
        }

        composable(route = TeacherGraph.LESSON_STUDENT_INFO) {
            studentInfo(navController, teacherMainViewModel)
        }

        composable(route = TeacherGraph.LESSON_STUDENT_LIST) {
            studentList(navController, teacherMainViewModel)
        }

    }
}

object TeacherGraph {
    const val TEACHER_MAIN = "TEACHER_MAIN"
    const val TEACHER_SETTING = "TEACHER_SETTING"

    const val TEACHER_LESSON = "TEACHER_LESSON"

    const val LESSON_STUDENT_LIST = "LESSON_STUDENT_LIST"
    const val LESSON_STUDENT_INFO = "LESSON_STUDENT_INFO"
}