package com.st17.workclass.data.consts.lesson

import com.st17.workclass.data.file.File
import com.st17.workclass.data.consts.lesson.LessonTime.endTime
import com.st17.workclass.data.consts.lesson.LessonTime.startTime
import com.st17.workclass.model.dateTime.Date

class Lesson(
    val name : String = "Lesson",
    val place : Int,
    val homework : String = "",
    val theme: String = "",
    var status : String = LessonStatus.NEXT,
    val office : String = "0",
    var date : Date = Date(0,0,0,0),
    var note : String = "Поле не заполнено"){

    var files : MutableList<File> = mutableListOf(File(name = "Файлы отсутствуют"))

    constructor(
        name : String = "Lesson",
        place : Int,
        homework : String = "",
        theme: String = "",
        status : String = LessonStatus.NEXT,
        office : String = "0",
        date : Date = Date(0,0,0,0),
        note : String = "",
        files : MutableList<File>) : this(name,place,homework,theme, status, office, date, note){
            this.files = files
        }

    fun getTimeOfStart() : String{
        return startTime[place]
    }

    fun getTimeOfEnd() : String{
        return endTime[place]
    }

    fun getStatusName() : String{
        return when (status){
            LessonStatus.PAST -> "Занятие проведено"
            LessonStatus.CURRENT -> "Идёт занятие"
            LessonStatus.NEXT -> ""
            else -> ""
        }
    }
}
