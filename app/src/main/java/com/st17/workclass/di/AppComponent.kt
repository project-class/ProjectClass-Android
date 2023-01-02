package com.st17.workclass.di

import android.content.Context
import com.st17.workclass.MainActivity
import com.st17.workclass.di.modules.AppModule
import com.st17.workclass.model.userManager.UserManager
import com.st17.workclass.ui.screens.auth.AuthActivity
import com.st17.workclass.ui.screens.student.StudentActivity
import com.st17.workclass.ui.screens.teacher.TeacherActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: StudentActivity)
    fun inject(activity: TeacherActivity)
    fun inject(activity: AuthActivity)

}
