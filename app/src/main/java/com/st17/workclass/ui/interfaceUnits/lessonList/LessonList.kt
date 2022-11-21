package com.st17.workclass.ui.interfaceUnits.lessonList

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.st17.workclass.data.Lesson
import com.st17.workclass.data.LessonStatus


@Composable
fun lessonList(lessons: MutableList<Lesson>) {

    LazyColumn {
        items(lessons.size) {currentLesson->
            lessonUnit(lessons[currentLesson])
        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewLessonList(){
    val lessons = mutableListOf<Lesson>()
    lessons.add(Lesson(name = "Math", homework = "p2, ex 1-5", place = 1, status = LessonStatus.PAST))
    lessons.add(Lesson(name = "Math", place = 2, status = LessonStatus.CURRENT))
    lessons.add(Lesson(name = "Russian language", place = 3, status = LessonStatus.NEXT))
    lessons.add(Lesson(name = "Russian language", place = 3, status = LessonStatus.NEXT))
    lessons.add(Lesson(name = "Culture", place = 3, status = LessonStatus.NEXT))
    lessons.add(Lesson(name = "Sociology", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 5, status = LessonStatus.NEXT))



    lessonList(lessons)
}

