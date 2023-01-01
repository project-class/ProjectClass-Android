package com.st17.workclass.di.modules

import com.st17.workclass.di.modules.TimeModule
import dagger.Module

@Module(includes = [TimeModule::class])
class AppModule