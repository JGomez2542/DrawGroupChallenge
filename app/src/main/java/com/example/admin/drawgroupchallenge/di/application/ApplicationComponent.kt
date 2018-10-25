package com.example.admin.drawgroupchallenge.di.application

import com.example.admin.drawgroupchallenge.data.repository.RepositoryImpl
import com.example.admin.drawgroupchallenge.di.activity.ActivityComponent
import com.example.admin.drawgroupchallenge.di.activity.ActivityModule
import dagger.Component

@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun newActivityComponent(activityModule: ActivityModule): ActivityComponent

    fun getRepositoryImpl(): RepositoryImpl
}