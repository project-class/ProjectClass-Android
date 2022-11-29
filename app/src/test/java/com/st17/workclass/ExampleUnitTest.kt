package com.st17.workclass

import com.st17.workclass.model.datetime.Time
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect1() {
        val time = Time()
        assertEquals("Tuesday",  time.getDayOfMonth())
    }

}