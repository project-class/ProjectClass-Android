package com.st17.workclass.ui.screens.teacher.mainscreen

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.st17.workclass.ui.background.mainBackground
import com.st17.workclass.ui.elements.buttons.buttonIconText
import com.st17.workclass.ui.elements.buttons.buttonTextIcon
import com.st17.workclass.ui.elements.shadow.extendedShadow
import com.st17.workclass.ui.elements.texts.addictionalText
import com.st17.workclass.ui.elements.texts.titleText
import com.st17.workclass.ui.interfaceComponents.lessonScreen.files.listOfFiles
import com.st17.workclass.ui.interfaceComponents.lessonScreen.notes
import com.st17.workclass.ui.interfaceComponents.lessonScreen.topLessonBar
import com.st17.workclass.ui.theme.White
import com.st17.workclass.R
import com.st17.workclass.ui.elements.buttons.confirmButton
import com.st17.workclass.ui.interfaceComponents.lessonScreen.files.listOfFilesT
import com.st17.workclass.ui.interfaceComponents.lessonScreen.teacherHomeWork
import com.st17.workclass.ui.navigation.StudentGraph
import com.st17.workclass.ui.navigation.TeacherGraph
import com.st17.workclass.ui.theme.GreenD

@SuppressLint("StateFlowValueCalledInComposition")
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun teacherLessonScreen(navController: NavHostController, teacherMainViewModel: TeacherMainViewModel) {
    mainBackground()

    Column {
        topLessonBar(teacherMainViewModel.lesson.value, teacherMainViewModel.date,
            navController = navController,
            onClick = {
                navController.popBackStack()
                navController.navigate(TeacherGraph.TEACHER_MAIN)})


        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)){
            addictionalText(color = White,
                text = String.format("%s кабинет", teacherMainViewModel.lesson.value.office))

            titleText(color = White,
                text = teacherMainViewModel.lesson.value.name)

            addictionalText(color = White,
                text = teacherMainViewModel.lesson.value.theme)
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .extendedShadow(
                borderRadius = 32.dp,
                blurRadius = 10.dp
            )
            .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
            .background(White)
            .padding(top = 35.dp, bottom = 110.dp)
            .verticalScroll(rememberScrollState())
        ){
            Column(modifier = Modifier
                .fillMaxSize()) {

                teacherHomeWork(teacherMainViewModel = teacherMainViewModel){
                    val l = teacherMainViewModel.lesson.value
                    l.homework = teacherMainViewModel.homework.value
                    teacherMainViewModel.updateLesson(l)
                }

                notes(teacherMainViewModel = teacherMainViewModel){
                    val l = teacherMainViewModel.lesson.value
                    l.note = teacherMainViewModel.note.value
                    teacherMainViewModel.updateLesson(l)
                }

                listOfFilesT(teacherMainViewModel.lesson.value.files){}


                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 12.dp),
                    horizontalArrangement = Arrangement.Center){
                    confirmButton(text = "Оценки и Посещаемость",
                        textColor = White, buttonColor = GreenD,
                        width = 328, height = 48,
                        onClick = {
                            navController.navigate(TeacherGraph.LESSON_STUDENT_LIST)
                        })
                }

            }
        }

    }

}