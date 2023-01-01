package com.st17.workclass

import android.app.Application
import com.st17.workclass.di.AppComponent
import com.st17.workclass.di.DaggerAppComponent

class MainApp : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }


}
