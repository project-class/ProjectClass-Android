package com.st17.workclass.ui.interfaceComponents.lessonScreen.files

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.st17.workclass.ui.elements.texts.addictionalText
import com.st17.workclass.ui.screens.student.mainscreen.StudentMainViewModel
import com.st17.workclass.ui.theme.GreyD

@Composable
fun listOfFiles(studentMainViewModel: StudentMainViewModel){
    Column(modifier = Modifier
        .padding(16.dp, 12.dp)) {

        addictionalText(text = "Прикреплённые файлы", color = GreyD, fontWeight = 500)

        studentMainViewModel.lesson.files.forEach { file ->
            fileUnit(file) {

            }
        }

    }
}