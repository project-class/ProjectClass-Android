package com.st17.workclass.ui.interfaceComponents.lessonScreen

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.st17.workclass.R
import com.st17.workclass.ui.elements.buttons.buttonIconText
import com.st17.workclass.ui.elements.texts.addictionalText
import com.st17.workclass.ui.screens.student.mainscreen.StudentMainViewModel
import com.st17.workclass.ui.theme.GreyN

@Composable
fun homeWork(studentMainViewModel: StudentMainViewModel){
    Column(modifier = Modifier
        .padding(16.dp, 12.dp)) {
            addictionalText(color = GreyN, text = "Домашнее задание", fontWeight = 500)

            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp, bottom = 16.dp)){
                addictionalText(textSize = 14.sp,
                    text = studentMainViewModel.lesson.homework,
                    fontWeight = 500)
            }

            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.End){

                buttonIconText(text = "Добавить уведомление", icon = R.drawable.ic_bell) {

                }
            }
        }
}