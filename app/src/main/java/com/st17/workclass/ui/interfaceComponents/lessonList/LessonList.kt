package com.st17.workclass.ui.interfaceComponents.lessonList

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.st17.workclass.data.ExampleLessonList
import com.st17.workclass.data.Lesson
import com.st17.workclass.data.LessonTime


@Composable
fun lessonList(lessons: MutableList<Lesson>) {

    LazyColumn(modifier = Modifier
                .padding(bottom = 16.dp)) {
        items(lessons.size) {currentLesson->
            lessonUnit(lesson = lessons[currentLesson],
                startTime = LessonTime.startTime[currentLesson],
                endTime = LessonTime.endTime[currentLesson])
        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewLessonList(){
    lessonList(ExampleLessonList.lessons)
}

