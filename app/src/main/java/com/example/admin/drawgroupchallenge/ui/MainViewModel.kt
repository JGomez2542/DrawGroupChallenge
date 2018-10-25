package com.example.admin.drawgroupchallenge.ui

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import com.example.admin.drawgroupchallenge.adapters.CountryMedalsAdapter
import com.example.admin.drawgroupchallenge.data.repository.RepositoryImpl

class MainViewModel(private val repository: RepositoryImpl): ViewModel() {
    fun getMedals(): LiveData<CountryMedalsAdapter> {
        return Transformations.map(repository.getMedals()) {
            CountryMedalsAdapter(it)
        }
    }

}