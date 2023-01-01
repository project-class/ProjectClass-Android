package com.st17.workclass.ui.interfaceComponents.mainScreen.lessonList

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.data.ExampleLessonList
import com.st17.workclass.data.Lesson
import com.st17.workclass.data.LessonTime
import com.st17.workclass.ui.navigation.StudentGraph
import com.st17.workclass.ui.screens.student.mainscreen.StudentMainViewModel

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun lessonList(navController : NavHostController, studentMainViewModel: StudentMainViewModel) {
    var lessons = studentMainViewModel.lessons.value

    LazyColumn(modifier = Modifier
                .padding(bottom = 110.dp)) {
        items(lessons.size) {currentLesson->
            lessonUnit(lesson = lessons[currentLesson],
                startTime = lessons[currentLesson].getTimeOfStart(),
                endTime = lessons[currentLesson].getTimeOfEnd(),
                onClick = {
                    studentMainViewModel.lesson = studentMainViewModel.lessons.value[currentLesson]
                    studentMainViewModel.updateNote(studentMainViewModel.lesson.note)
                    navController.navigate(StudentGraph.STUDENT_LESSON)
                })
        }
    }
}


