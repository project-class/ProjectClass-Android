package com.st17.workclass.ui.screens.student.mainscreen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import com.st17.workclass.di.DaggerStudentComponent
import com.st17.workclass.di.StudentComponent
import com.st17.workclass.model.datetime.Date
import com.st17.workclass.model.datetime.Time
import javax.inject.Inject


class StudentMainViewModel() : ViewModel() {
    private val component: StudentComponent = DaggerStudentComponent.create()

    val time: Time = component.time


    @RequiresApi(Build.VERSION_CODES.O)
    var date = time.getCurrentDate()

    @RequiresApi(Build.VERSION_CODES.O)
    fun getWeek(date : Date): MutableList<Date>{
        return time.getWeekByDate(date)
    }
}
