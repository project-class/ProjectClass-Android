package com.st17.workclass.model.datetime

class Date(year: Int, month : Int, day : Int, dayOfWeek : Int) {

    constructor(date: Date) : this(year = date.year, month = date.month, day = date.day, dayOfWeek = date.dayOfWeek){}

    var year: Int = year
    var month : Int = month
    var day : Int = day
    var dayOfWeek : Int = dayOfWeek

}
