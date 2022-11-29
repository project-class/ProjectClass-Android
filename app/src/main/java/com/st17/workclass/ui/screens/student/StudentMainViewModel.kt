package com.st17.workclass.ui.screens.student

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import com.st17.workclass.data.ExampleLessonList
import com.st17.workclass.data.Lesson
import com.st17.workclass.model.datetime.CurrentTime
import com.st17.workclass.model.datetime.Date

class StudentMainViewModel : ViewModel() {
    val mutableList = ExampleLessonList.lessons
    val time = CurrentTime()

    @RequiresApi(Build.VERSION_CODES.O)
    var date = time.getCurrentDate()




}