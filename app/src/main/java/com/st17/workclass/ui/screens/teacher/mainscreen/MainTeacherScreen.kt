package com.st17.workclass.ui.screens.teacher.mainscreen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.background.mainBackground
import com.st17.workclass.ui.interfaceComponents.mainScreen.calendar.calendar
import com.st17.workclass.ui.interfaceComponents.mainScreen.lessonList.lessonList
import com.st17.workclass.ui.elements.shadow.extendedShadow
import com.st17.workclass.ui.theme.White

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun mainTeacherScreen(
    navController: NavHostController = rememberNavController(),
    teacherMainViewModel: TeacherMainViewModel
    ){
    mainBackground()

    Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {

        Box(modifier = Modifier
            .fillMaxHeight(176/800f)
            .fillMaxWidth()){
            calendar(teacherMainViewModel.date, teacherMainViewModel)
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .extendedShadow(
                borderRadius = 32.dp,
                blurRadius = 10.dp
            )
            .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
            .background(White)
            ){
            Column {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()){
                    lessonList(navController, teacherMainViewModel)
                }
            }
        }
    }
}
