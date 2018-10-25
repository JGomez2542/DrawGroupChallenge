package com.example.admin.drawgroupchallenge.data.repository

import android.arch.lifecycle.LiveData
import com.example.admin.drawgroupchallenge.data.entities.Country

interface Repository {

    fun getMedals(): LiveData<List<Country>>

    fun insertCountry(country: Country)
}