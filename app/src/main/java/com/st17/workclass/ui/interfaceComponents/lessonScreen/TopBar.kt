package com.st17.workclass.ui.interfaceComponents.lessonScreen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.elements.buttons.returnBackArrowButtonWhite
import com.st17.workclass.ui.elements.texts.addictionalText
import com.st17.workclass.ui.elements.shadow.extendedShadow
import com.st17.workclass.ui.navigation.StudentGraph
import com.st17.workclass.ui.screens.student.mainscreen.StudentMainViewModel
import com.st17.workclass.ui.theme.GreenD
import com.st17.workclass.ui.theme.White

@Composable
@RequiresApi(Build.VERSION_CODES.O)
fun topLessonBar(studentMainViewModel: StudentMainViewModel = StudentMainViewModel(),
                 navHostController: NavHostController = rememberNavController()
){
    val lesson = studentMainViewModel.lesson
    lesson.date = studentMainViewModel.date

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(76.dp)
        .extendedShadow(blurRadius = 20.dp)
        .background(color = GreenD)
        .padding(top = 34.dp),
        horizontalArrangement = Arrangement.SpaceBetween){

        Row {
            Box(modifier = Modifier
                .padding(top = 18.dp, bottom = 18.dp, start = 16.dp, end = 16.dp)){
                returnBackArrowButtonWhite(navHostController, StudentGraph.STUDENT_MAIN)
            }

            Column(modifier = Modifier
                .padding(start = 4.dp)
                .fillMaxHeight(),
                verticalArrangement = Arrangement.Center){
                addictionalText(color = White,
                    text = String.format("%s, %d %s",
                        lesson.date.getNameDayOfWeek(),
                        lesson.date.day + 1,
                        lesson.date.getNameMonth()))

                addictionalText(color = White,
                    text = String.format("%s - %s",
                        lesson.getTimeOfStart(),
                        lesson.getTimeOfEnd()))
            }
        }

        Column(modifier = Modifier
            .padding(end = 16.dp)
            .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceAround
        ){
            addictionalText(color = White,
                text = String.format("%s",
                    lesson.getStatusName()))
        }
    }
}
