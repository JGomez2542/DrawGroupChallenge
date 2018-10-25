package com.example.admin.drawgroupchallenge.di.activity

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import com.example.admin.drawgroupchallenge.R
import com.example.admin.drawgroupchallenge.databinding.ActivityMainBinding
import com.example.admin.drawgroupchallenge.factories.MainViewModelFactory
import com.example.admin.drawgroupchallenge.ui.MainViewModel
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(val activity: AppCompatActivity) {

    @Provides
    @ActivityScope
    fun providesMainViewModel(mainViewModelFactory: MainViewModelFactory) =
        ViewModelProviders.of(activity, mainViewModelFactory).get(MainViewModel::class.java)

    @Provides
    @ActivityScope
    fun providesMainActivityBinding() =
        DataBindingUtil.setContentView<ActivityMainBinding>(activity, R.layout.activity_main)
}