package com.st17.workclass.ui.interfaceComponents.mainScreen.lessonList

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.st17.workclass.ui.navigation.StudentGraph
import com.st17.workclass.ui.navigation.TeacherGraph
import com.st17.workclass.ui.screens.student.mainscreen.StudentMainViewModel
import com.st17.workclass.ui.screens.teacher.mainscreen.TeacherMainViewModel

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


@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun lessonList(navController : NavHostController, teacherMainViewModel: TeacherMainViewModel) {

    val lessons = teacherMainViewModel.lessons.collectAsState()

    LazyColumn(modifier = Modifier
        .padding(bottom = 110.dp)) {
        items(lessons.value.size) {currentLesson->
            lessonUnit(lesson = lessons.value[currentLesson],
                startTime = lessons.value[currentLesson].getTimeOfStart(),
                endTime = lessons.value[currentLesson].getTimeOfEnd(),
                onClick = {
                    teacherMainViewModel.setLesson(teacherMainViewModel.lessons.value[currentLesson])
                    teacherMainViewModel.setNote(teacherMainViewModel.lesson.value.note)
                    teacherMainViewModel.setHomeWork(teacherMainViewModel.lesson.value.homework)
                    navController.navigate(TeacherGraph.TEACHER_LESSON)
                })
        }
    }
}
