package com.example.admin.drawgroupchallenge.factories

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.admin.drawgroupchallenge.data.repository.RepositoryImpl
import com.example.admin.drawgroupchallenge.ui.AddCountryViewModel
import javax.inject.Inject

class AddCountryViewModelFactory @Inject constructor(val repository: RepositoryImpl) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(AddCountryViewModel::class.java)) AddCountryViewModel(repository) as T
        else throw IllegalArgumentException("ViewModel not found")
    }
}