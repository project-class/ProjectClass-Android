package com.st17.workclass.ui.screens.teacher.mainscreen.marks

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.st17.workclass.R
import com.st17.workclass.ui.elements.buttons.buttonTextIcon
import com.st17.workclass.ui.elements.buttons.confirmButton
import com.st17.workclass.ui.elements.buttons.returnBackArrowButtonBlack
import com.st17.workclass.ui.elements.img.emptyAvatar
import com.st17.workclass.ui.elements.texts.titleText
import com.st17.workclass.ui.navigation.TeacherGraph
import com.st17.workclass.ui.screens.teacher.mainscreen.TeacherMainViewModel
import com.st17.workclass.ui.theme.*

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun studentInfo(navController: NavHostController, teacherMainViewModel: TeacherMainViewModel) {
    Column(modifier = Modifier
        .padding(top = 35.dp, bottom = 110.dp)) {
        Box(modifier = Modifier
            .padding(top = 20.dp, start = 30.dp, end = 10.dp, bottom = 10.dp)){
            returnBackArrowButtonBlack {
                navController.navigate(TeacherGraph.LESSON_STUDENT_LIST)
            }
        }

        Row(modifier = Modifier
            .padding(top = 0.dp, bottom = 15.dp, start = 15.dp, end = 15.dp),
            verticalAlignment = Alignment.CenterVertically){
            emptyAvatar(140)


            titleText(text = teacherMainViewModel.studentData.value.name, textSize = 29.sp)
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {

            buttonTextIcon(text = "Отсутствие",height = 40, width = 242,
                textColor = Black, backgroundColor = BrownL,
                icon = R.drawable.ic_not_on_lesson) {
                teacherMainViewModel.setMark("У")
            }


            buttonTextIcon(text = "", height = 40, width = 70,
                textColor = Black, backgroundColor = GreyD,
                icon = R.drawable.ic_n){
                teacherMainViewModel.setMark("Н")
            }
        }

        Box(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)){
            loginMark(teacherMainViewModel)
        }

        Box(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)){
            loginComment(teacherMainViewModel)
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
            contentAlignment = Alignment.BottomCenter){
            confirmButton(text = "Сохранить", textColor = White,
                buttonColor = Black, width = 320, height = 48) {
                val l = teacherMainViewModel.studentData.value
                l.mark = teacherMainViewModel.mark.value
                l.comment = teacherMainViewModel.comment.value
                teacherMainViewModel.updateStudentDataList(l)
            }
        }
    }
}


@Composable
fun loginMark(teacherMainViewModel: TeacherMainViewModel){

    val mainColor = BrownM
    val backgroundColor = BrownL.copy(0.35f)

    val text = teacherMainViewModel.mark.collectAsState()

    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(4.dp))) {
        TextField(
            value = text.value,
            onValueChange = { teacherMainViewModel.setMark(it) },
            modifier = Modifier
                .defaultMinSize(minWidth = 328.dp,minHeight = 56.dp),
            label = { Text(text = "Оценки за урок") },
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                cursorColor = mainColor,
                focusedLabelColor = mainColor.copy(alpha = 0.54f),
                unfocusedLabelColor = Black.copy(alpha = 0.54f),
                textColor = Black,
                backgroundColor = backgroundColor,
                focusedIndicatorColor = mainColor,
                unfocusedIndicatorColor = Transparent
            )
        )
    }
}

@Composable
fun loginComment(teacherMainViewModel: TeacherMainViewModel){

    val mainColor = BrownM
    val backgroundColor = BrownL.copy(0.35f)

    val text = teacherMainViewModel.comment.collectAsState()

    Box(modifier = Modifier
        .clip(RoundedCornerShape(4.dp))) {
        TextField(
            value = text.value,
            onValueChange = { teacherMainViewModel.setComment(it) } ,
            modifier = Modifier
                .defaultMinSize(minWidth = 328.dp,minHeight = 56.dp),
            label = { Text(text = "Коментарий к оценке") },
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                cursorColor = mainColor,
                focusedLabelColor = mainColor.copy(alpha = 0.54f),
                unfocusedLabelColor = Black.copy(alpha = 0.54f),
                textColor = Black,
                backgroundColor = backgroundColor,
                focusedIndicatorColor = mainColor,
                unfocusedIndicatorColor = Transparent
            )
        )
    }
}