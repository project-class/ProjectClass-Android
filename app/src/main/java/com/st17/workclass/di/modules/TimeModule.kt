package com.st17.workclass.di.modules

import com.st17.workclass.model.dateTime.Time
import dagger.Module
import dagger.Provides

@Module
class TimeModule {

    @Provides
    fun provideTime(): Time {
        return Time()
    }
}