package com.st17.workclass.di.modules

import com.st17.workclass.model.sharedPreferences.SharedPreferencesStorage
import com.st17.workclass.model.sharedPreferences.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class StorageModule {
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
}
