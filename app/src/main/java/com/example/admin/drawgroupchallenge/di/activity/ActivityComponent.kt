package com.example.admin.drawgroupchallenge.di.activity

import com.example.admin.drawgroupchallenge.di.fragment.FragmentComponent
import com.example.admin.drawgroupchallenge.di.fragment.FragmentModule
import com.example.admin.drawgroupchallenge.factories.MainViewModelFactory
import com.example.admin.drawgroupchallenge.ui.MainActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {

    fun newFragmentComponent(fragmentModule: FragmentModule): FragmentComponent

    fun getMainViewModelFactory(): MainViewModelFactory

    fun inject(mainActivity: MainActivity)
}