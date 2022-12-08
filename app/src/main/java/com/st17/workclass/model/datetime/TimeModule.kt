package com.st17.workclass.model.datetime

import dagger.Module
import dagger.Provides

@Module
class TimeModule {

    @Provides
    fun provideTime(): Time{
        return Time()
    }
}