package com.st17.workclass.model.datetime

import android.os.Build
import androidx.annotation.RequiresApi
import com.st17.workclass.data.CalendarMonthLength
import dagger.Module
import dagger.Provides
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

class Time {

    @RequiresApi(Build.VERSION_CODES.O)
    fun getCurrentDate(): Date{
        return Date(getYear(), getMonth(), getDayOfMonth(), getDayOfWeek())
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getWeekByDate(cDate : Date): MutableList<Date>{
        val week = mutableListOf<Date>()
        val date: LocalDate = LocalDate.of(cDate.year, cDate.month + 1, cDate.day + 1)
        var currentDate : LocalDate

        for (i in 0..6){
            if (i < cDate.dayOfWeek){
                currentDate = date.minusDays(cDate.dayOfWeek.toLong() - i)
            }
            else if(i > cDate.dayOfWeek){
                currentDate = date.plusDays(i - cDate.dayOfWeek.toLong())
            }
            else{
                currentDate = date
            }

            week.add(Date(year = currentDate.year, month = currentDate.monthValue, day = currentDate.dayOfMonth, dayOfWeek = i))
        }

        return week;
    }



    @RequiresApi(Build.VERSION_CODES.O)
    private fun getMinutes(): Int {
        val localDate: LocalDateTime = LocalDateTime.now()
        return localDate.minute
    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun getHour(): Int {
        val localDate: LocalDateTime = LocalDateTime.now()
        return localDate.hour
    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun getDayOfWeek(): Int {
        val localDate: LocalDate = LocalDate.now()
        return localDate.dayOfWeek.value - 1
    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun getDayOfMonth(): Int {
        val localDate: LocalDate = LocalDate.now()
        return localDate.dayOfMonth - 1
    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun getMonth(): Int {
        val localDate: LocalDate = LocalDate.now()
        return localDate.monthValue - 1
    }

    private fun getMonthLength(month : Int): Int {
        return CalendarMonthLength.monthLength[month]
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun getYear(): Int {
        val localDate: LocalDate = LocalDate.now()
        return localDate.year
    }




}
