package com.st17.workclass.model.datetime

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

class Time {
    @RequiresApi(Build.VERSION_CODES.O)
    fun getMinutes(): Int {
        val localDate: LocalDateTime = LocalDateTime.now()
        return localDate.minute
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getHour(): Int {
        val localDate: LocalDateTime = LocalDateTime.now()
        return localDate.hour
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getDayOfWeek(): Int {
        val localDate: LocalDate = LocalDate.now()
        return localDate.dayOfWeek.value
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getDayOfMonth(): Int {
        val localDate: LocalDate = LocalDate.now()
        return localDate.dayOfMonth
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getMonth(): Int {
        val localDate: LocalDate = LocalDate.now()
        return localDate.monthValue
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getYear(): Int {
        val localDate: LocalDate = LocalDate.now()
        return localDate.year
    }
}
