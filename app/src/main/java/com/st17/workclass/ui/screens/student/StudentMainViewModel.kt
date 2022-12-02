package com.st17.workclass.ui.screens.student

import android.app.Application
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import com.st17.workclass.model.datetime.CurrentTime
import com.st17.workclass.model.datetime.Date
import com.st17.workclass.model.datetime.Time

class StudentMainViewModel() : ViewModel() {
    val application: Application = Application()
    val cTime = CurrentTime()
    val time = Time()

    @RequiresApi(Build.VERSION_CODES.O)
    var date = cTime.getCurrentDate()

    @RequiresApi(Build.VERSION_CODES.O)
    fun getWeek(date : Date): MutableList<Date>{
        return time.getWeekByDate(date)
    }



}