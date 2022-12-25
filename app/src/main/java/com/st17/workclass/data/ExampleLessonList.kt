package com.st17.workclass.data

object ExampleLessonList {
    val lessons = mutableListOf<Lesson>(
        Lesson(name = "Math", homework = "p2, ex 1-5", place = 1, status = LessonStatus.PAST, office = "10", theme = "Теория вероятностей и Математическая статистика"),
        Lesson(name = "Math", place = 2, status = LessonStatus.CURRENT, office = "10", theme = "Теория вероятностей и Математическая статистика"),
        Lesson(name = "Russian language", place = 3, status = LessonStatus.NEXT, office = "32", theme = "Причастные и деепричастные обороты"),
        Lesson(name = "Russian language", place = 4, status = LessonStatus.NEXT, office = "32", theme = "Причастные и деепричастные обороты"),
        Lesson(name = "Sociology", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 5, status = LessonStatus.NEXT, office = "13", theme = "Гражданское общество"),
        Lesson(name = "Sociology", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 6, status = LessonStatus.NEXT, office = "13", theme = "Гражданское общество"),
        Lesson(name = "Economy", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 7, status = LessonStatus.NEXT, office = "24", theme = "Типы экономик (плановая, смешаная, рыночная)"),
        Lesson(name = "Economy", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 8, status = LessonStatus.NEXT, office = "24", theme = "Типы экономик (плановая, смешаная, рыночная)")
    )

    val lessons2 = mutableListOf<Lesson>(
        Lesson(name = "Math", homework = "p2, ex 1-5", place = 1, status = LessonStatus.PAST),
        Lesson(name = "Math", place = 2, status = LessonStatus.CURRENT),
        Lesson(name = "Russian language", place = 3, status = LessonStatus.NEXT),
        Lesson(name = "Russian language", place = 3, status = LessonStatus.NEXT),
        Lesson(name = "Culture", place = 3, status = LessonStatus.NEXT)
    )
}