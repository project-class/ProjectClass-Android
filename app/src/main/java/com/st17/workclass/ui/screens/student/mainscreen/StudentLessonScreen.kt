package com.st17.workclass.ui.screens.student.mainscreen

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
import com.st17.workclass.ui.interfaceComponents.lessonScreen.studentHomeWork
import com.st17.workclass.ui.interfaceComponents.lessonScreen.notes
import com.st17.workclass.ui.interfaceComponents.lessonScreen.topLessonBar
import com.st17.workclass.ui.theme.White
import com.st17.workclass.R
import com.st17.workclass.ui.navigation.StudentGraph

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun studentLessonScreen(navController: NavHostController, studentMainViewModel: StudentMainViewModel) {
    mainBackground()

    Column {
        topLessonBar(studentMainViewModel.lesson, studentMainViewModel.date,
            navController = navController,
            onClick = {
                navController.popBackStack()
                navController.navigate(StudentGraph.STUDENT_MAIN)})

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween){
            buttonIconText(
                text = String.format("Вторник, 23.12"), backgroundColor = White.copy(alpha = 0.4f),
                icon = R.drawable.button_arrow_back_white) {  }
            buttonTextIcon(
                text = String.format("Пятница, 27.12"), backgroundColor = White.copy(alpha = 0.4f),
                icon = R.drawable.button_arrow_next_white) {  }
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)){
            addictionalText(color = White,
                text = String.format("%s кабинет", studentMainViewModel.lesson.office))

            titleText(color = White,
                text = studentMainViewModel.lesson.name)

            addictionalText(color = White,
                text = studentMainViewModel.lesson.theme)
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

                studentHomeWork(studentMainViewModel = studentMainViewModel)

                notes(studentMainViewModel = studentMainViewModel)

                listOfFiles(studentMainViewModel.lesson.files)
            }
        }

    }

}