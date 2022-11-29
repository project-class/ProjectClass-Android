package com.st17.workclass

import com.st17.workclass.model.datetime.Time
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TestTime {
    @Test
    fun testMinutes() {
        val time = Time()
        assertEquals(54,  time.getMinutes())
    }

    @Test
    fun testHours() {
        val time = Time()
        assertEquals(16,  time.getHour())
    }

    @Test
    fun testDayWeek() {
        val time = Time()
        assertEquals(2,  time.getDayOfWeek())
    }

    @Test
    fun testDayMonth() {
        val time = Time()
        assertEquals(22,  time.getDayOfMonth())
    }

    @Test
    fun testMonth() {
        val time = Time()
        assertEquals(11,  time.getMonth())
    }

    @Test
    fun testYear() {
        val time = Time()
        assertEquals(2022,  time.getYear())
    }
}