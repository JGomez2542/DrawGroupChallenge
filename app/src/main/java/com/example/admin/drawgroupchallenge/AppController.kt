package com.example.admin.drawgroupchallenge

import android.app.Application
import com.example.admin.drawgroupchallenge.di.application.ApplicationComponent
import com.example.admin.drawgroupchallenge.di.application.ApplicationModule
import com.example.admin.drawgroupchallenge.di.application.DaggerApplicationComponent

class AppController : Application() {

    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent
            .builder().applicationModule(ApplicationModule(this))
            .build()
    }
}