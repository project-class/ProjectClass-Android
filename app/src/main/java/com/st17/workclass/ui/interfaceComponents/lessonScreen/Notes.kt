package com.st17.workclass.ui.interfaceComponents.lessonScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import com.st17.workclass.R
import com.st17.workclass.ui.elements.buttons.buttonIconText
import com.st17.workclass.ui.elements.texts.addictionalText
import com.st17.workclass.ui.screens.student.mainscreen.StudentMainViewModel
import com.st17.workclass.ui.theme.Black
import com.st17.workclass.ui.theme.GreyN
import com.st17.workclass.ui.theme.Transparent

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun notes(studentMainViewModel: StudentMainViewModel){
    val initialText: String = studentMainViewModel.currentNote.value
    val textNote = studentMainViewModel.currentNote.collectAsState(initial = initialText)

    Column(modifier = Modifier
        .padding(16.dp, 12.dp)) {
        addictionalText(color = GreyN, text = "Заметки",fontWeight = 500)

        Box(modifier = Modifier
            .padding(top = 4.dp, bottom = 16.dp)){

            TextField(
                value = textNote.value,
                onValueChange = { studentMainViewModel.updateNote(it) },
                modifier = Modifier
                    .fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    cursorColor = Black,
                    focusedLabelColor = Transparent,
                    unfocusedLabelColor = Transparent,
                    textColor = Black,
                    backgroundColor = Transparent,
                    focusedIndicatorColor = Transparent,
                    unfocusedIndicatorColor = Transparent
                )
            )
        }

        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.End){

            buttonIconText(text = "Добавить Заметку", icon = R.drawable.ic_list,
                onClick = {
                    studentMainViewModel.updateLesson(studentMainViewModel.currentNote.value)
            })
        }
    }
}