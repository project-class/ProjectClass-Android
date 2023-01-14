package com.st17.workclass.ui.screens.teacher.mainscreen.marks

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.st17.workclass.ui.elements.buttons.returnBackArrowButtonBlack
import com.st17.workclass.ui.elements.texts.titleText
import com.st17.workclass.ui.interfaceComponents.mainScreen.lessonList.lessonUnit
import com.st17.workclass.ui.navigation.TeacherGraph
import com.st17.workclass.ui.screens.teacher.mainscreen.TeacherMainViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun studentList(navController: NavHostController, teacherMainViewModel: TeacherMainViewModel) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 35.dp, start = 13.dp)){
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)){

            Box(modifier = Modifier
                .padding(top = 15.dp, start = 10.dp, end = 10.dp, bottom = 10.dp)){
                returnBackArrowButtonBlack {
                    navController.navigate(TeacherGraph.TEACHER_LESSON)
                }
            }

            Box(modifier = Modifier
                .padding(10.dp),
                contentAlignment = Alignment.Center){
                titleText(text = "${teacherMainViewModel.date.getNameDayOfWeek()}, " +
                        "${teacherMainViewModel.date.day} ${teacherMainViewModel.date.getNameMonth()}",
                    textSize = 20.sp)
            }


        }

        val studentDataList = teacherMainViewModel.studentDataList.collectAsState()

        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 110.dp)) {
            items(studentDataList.value.size) { currentStudent ->

                val i = studentDataList.value[currentStudent]
                i.place = currentStudent + 1
                teacherMainViewModel.updateStudentDataList(i)


                studentUnit(
                    i = studentDataList.value[currentStudent].place,
                    text = studentDataList.value[currentStudent].name,
                    mark = studentDataList.value[currentStudent].mark,
                    onClick = {
                        teacherMainViewModel.setStudentData(studentDataList.value[currentStudent])
                        teacherMainViewModel.setMark(studentDataList.value[currentStudent].mark)
                        teacherMainViewModel.setComment(studentDataList.value[currentStudent].comment)
                        navController.navigate(TeacherGraph.LESSON_STUDENT_INFO)
                    })
            }
        }
    }
}
