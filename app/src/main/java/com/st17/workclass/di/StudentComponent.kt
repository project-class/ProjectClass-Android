package com.st17.workclass.di

import com.st17.workclass.model.datetime.Time
import com.st17.workclass.model.datetime.TimeModule
import dagger.Component

@Component(modules = [TimeModule::class])
interface StudentComponent {
    val time: Time
}