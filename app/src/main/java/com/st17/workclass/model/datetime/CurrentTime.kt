package com.st17.workclass.model.datetime

import android.os.Build
import androidx.annotation.RequiresApi

class CurrentTime {
    val time = Time();

    @RequiresApi(Build.VERSION_CODES.O)
    fun getCurrentDate(): Date{
        return Date(time.getYear(), time.getMonth(), time.getDayOfMonth(), time.getDayOfWeek())
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getCurrentTime(): Date{
        return Date(time.getYear(), time.getMonth(), time.getDayOfMonth(), time.getDayOfWeek())
    }
}
