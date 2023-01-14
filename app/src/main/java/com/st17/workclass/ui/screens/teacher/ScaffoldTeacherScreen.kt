package com.st17.workclass.ui.screens.teacher

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.navigation.teacherGraph
import com.st17.workclass.ui.screens.student.mainscreen.StudentMainViewModel
import com.st17.workclass.ui.screens.teacher.mainscreen.TeacherMainViewModel

@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun scaffoldTeacherScreen(teacherMainViewModel : TeacherMainViewModel){
    val navController = rememberNavController()

    Scaffold(
        content = { teacherGraph(navController, teacherMainViewModel ) },
        bottomBar = { bottomStudentNavigationBar(navController = navController) }
    )
}