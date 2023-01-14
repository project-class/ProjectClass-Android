package com.st17.workclass.ui.interfaceComponents.lessonScreen.files

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.st17.workclass.R
import com.st17.workclass.data.file.File
import com.st17.workclass.ui.elements.buttons.buttonIconText
import com.st17.workclass.ui.elements.texts.addictionalText
import com.st17.workclass.ui.screens.student.mainscreen.StudentMainViewModel
import com.st17.workclass.ui.theme.GreyD

@Composable
fun listOfFiles(files: MutableList<File>){
    Column(modifier = Modifier
        .padding(16.dp, 12.dp)) {

        addictionalText(text = "Прикреплённые файлы", color = GreyD, fontWeight = 500)

        files.forEach { file ->
            fileUnit(file) {

            }
        }

    }
}

@Composable
fun listOfFilesT(files: MutableList<File>,onClick: ()-> Unit){
    Column(modifier = Modifier
        .padding(16.dp, 12.dp)) {

        addictionalText(text = "Прикреплённые файлы", color = GreyD, fontWeight = 500)

        files.forEach { file ->
            fileUnit(file) {

            }
        }

        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.End){

            buttonIconText(text = "Добавить домашнее задание", icon = R.drawable.ic_list) {
                onClick()
            }
        }

    }
}

