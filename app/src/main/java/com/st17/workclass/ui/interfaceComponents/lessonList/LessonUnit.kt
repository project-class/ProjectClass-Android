package com.st17.workclass.ui.interfaceComponents.lessonList

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.st17.workclass.data.Lesson
import com.st17.workclass.data.LessonStatus
import com.st17.workclass.ui.elements.texts.addictionalText
import com.st17.workclass.ui.elements.texts.titleText
import com.st17.workclass.ui.theme.BrownN
import com.st17.workclass.ui.theme.GreenD
import com.st17.workclass.ui.theme.GreyD

@Composable
fun lessonUnit(lesson: Lesson,
               startTime: String = "00:00", endTime: String = "00:45"){

    var statusColor : Color?
    var statusText : String?

    when(lesson.status) {
        LessonStatus.PAST -> {statusColor = GreenD
                                statusText = "Занятие проведено"}
        LessonStatus.CURRENT -> {statusColor = BrownN
                                statusText = "Идёт занятие"}
        else -> {statusColor = null
            statusText = null}
    }


    Row(modifier = Modifier
        .padding(start = 16.dp, end = 16.dp, top = 23.dp)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(17.dp)
    ){
        Column(
            modifier = Modifier
                .padding(top = 7.dp)
                .width(31.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            addictionalText(text = startTime, color = GreyD, fontWeight = 500)
            addictionalText(text = endTime, color = GreyD, fontWeight = 500)
        }

        Column() {
            if (statusColor != null && statusText != null){
                addictionalText(text = statusText, color = statusColor)
            }
            titleText(text = lesson.name, textSize = 24.sp)
            if (!lesson.homework.isEmpty()){
                addictionalText(text = lesson.homework, color = GreyD)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewLessonUnit(){
    val lesson = Lesson(place = 1, status = LessonStatus.CURRENT)
    lessonUnit(lesson)
}
