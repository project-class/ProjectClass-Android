package com.st17.workclass.data

data class Lesson(val name : String = "Lesson", val place : Int, val homework : String = "", var status : String = LessonStatus.NEXT)
