package com.st17.workclass.ui.screens.student

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.data.Lesson
import com.st17.workclass.data.LessonStatus
import com.st17.workclass.ui.background.mainBackground
import com.st17.workclass.ui.interfaceUnits.calendar.calendar
import com.st17.workclass.ui.interfaceUnits.lessonList.lessonList
import com.st17.workclass.ui.interfaceUnits.lessonList.extendedShadow
import com.st17.workclass.ui.theme.White

@Preview
@Composable
fun mainStudentScreen(navController: NavHostController = rememberNavController()){
    mainBackground()

    Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {

        Box(modifier = Modifier
            .fillMaxHeight(176/800f)
            .fillMaxWidth()){
            calendar()
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
                    val lessons = mutableListOf<Lesson>()
                    lessons.add(Lesson(name = "Math", homework = "p2, ex 1-5", place = 1, status = LessonStatus.PAST))
                    lessons.add(Lesson(name = "Math", place = 2, status = LessonStatus.CURRENT))
                    lessons.add(Lesson(name = "Russian language", place = 3, status = LessonStatus.NEXT))
                    lessons.add(Lesson(name = "Russian language", place = 3, status = LessonStatus.NEXT))
                    lessons.add(Lesson(name = "Culture", place = 3, status = LessonStatus.NEXT))
                    lessons.add(Lesson(name = "Sociology", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 5, status = LessonStatus.NEXT))
                    lessonList(lessons)
                }
            }
        }
    }
}
