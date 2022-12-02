package com.st17.workclass.data

object ExampleLessonList {
    val lessons = mutableListOf<Lesson>(
        Lesson(name = "Math", homework = "p2, ex 1-5", place = 1, status = LessonStatus.PAST),
        Lesson(name = "Math", place = 2, status = LessonStatus.CURRENT),
        Lesson(name = "Russian language", place = 3, status = LessonStatus.NEXT),
        Lesson(name = "Russian language", place = 3, status = LessonStatus.NEXT),
        Lesson(name = "Culture", place = 3, status = LessonStatus.NEXT),
        Lesson(name = "Sociology", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 5, status = LessonStatus.NEXT),
        Lesson(name = "sociology", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 5, status = LessonStatus.NEXT),
        Lesson(name = "Socioldogy", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 5, status = LessonStatus.NEXT),
        Lesson(name = "Sociologvy", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 5, status = LessonStatus.NEXT),
        Lesson(name = "Socioldvogy", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 5, status = LessonStatus.NEXT),
        Lesson(name = "Sociolowvgy", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 5, status = LessonStatus.NEXT),
    )

    val lessons2 = mutableListOf<Lesson>(
        Lesson(name = "Math", homework = "p2, ex 1-5", place = 1, status = LessonStatus.PAST),
        Lesson(name = "Math", place = 2, status = LessonStatus.CURRENT),
        Lesson(name = "Russian language", place = 3, status = LessonStatus.NEXT),
        Lesson(name = "Russian language", place = 3, status = LessonStatus.NEXT),
        Lesson(name = "Culture", place = 3, status = LessonStatus.NEXT)
    )
}