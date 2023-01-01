package com.st17.workclass.ui.screens.student

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.navigation.studentGraph
import com.st17.workclass.ui.screens.student.mainscreen.StudentMainViewModel

@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun scaffoldStudentScreen(studentMainViewModel : StudentMainViewModel){
    val navController = rememberNavController()

    Scaffold(
        content = { studentGraph(navController, studentMainViewModel) },
        bottomBar = { bottomStudentNavigationBar(navController = navController) }
    )
}