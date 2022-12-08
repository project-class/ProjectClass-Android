package com.st17.workclass.ui.screens.student

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import com.st17.workclass.di.StudentComponent
import com.st17.workclass.model.datetime.Date
import javax.inject.Inject


class StudentMainViewModel @Inject constructor(private val component: StudentComponent) : ViewModel() {
    val time = component.time

    @RequiresApi(Build.VERSION_CODES.O)
    var date = time.getCurrentDate()

    @RequiresApi(Build.VERSION_CODES.O)
    fun getWeek(date : Date): MutableList<Date>{
        return time.getWeekByDate(date)
    }



}