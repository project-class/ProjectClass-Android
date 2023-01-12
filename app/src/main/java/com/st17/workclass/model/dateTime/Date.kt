package com.st17.workclass.model.dateTime

import com.st17.workclass.data.calendar.CalendarNames.daysOfWeekName
import com.st17.workclass.data.calendar.CalendarNames.daysOfWeekShortName
import com.st17.workclass.data.calendar.CalendarNames.monthsName

class Date(year: Int, month : Int, day : Int, dayOfWeek : Int) {
    constructor(date: Date) : this(year = date.year, month = date.month, day = date.day, dayOfWeek = date.dayOfWeek){}

    var year: Int = year
    var month : Int = month
    var day : Int = day
    var dayOfWeek : Int = dayOfWeek


    fun getNameMonth() : String{
        return monthsName[month]
    }

    fun getNameDayOfWeek() : String{
        return daysOfWeekName[dayOfWeek]
    }

    fun getShirtNameDayOfWeek() : String{
        return daysOfWeekShortName[dayOfWeek]
    }
}
