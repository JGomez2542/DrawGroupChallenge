package com.example.admin.drawgroupchallenge.di.fragment

import com.example.admin.drawgroupchallenge.factories.AddCountryViewModelFactory
import com.example.admin.drawgroupchallenge.ui.AddCountryDialogFragment
import dagger.Subcomponent

@FragmentScope
@Subcomponent(modules = [FragmentModule::class])
interface FragmentComponent {

    fun getAddCountryViewModelFactory(): AddCountryViewModelFactory

    fun inject(addCountryDialogFragment: AddCountryDialogFragment)
}