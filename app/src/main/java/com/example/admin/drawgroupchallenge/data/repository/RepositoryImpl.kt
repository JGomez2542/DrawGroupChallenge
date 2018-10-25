package com.example.admin.drawgroupchallenge.data.repository

import android.arch.lifecycle.LiveData
import com.example.admin.drawgroupchallenge.data.database.Database
import com.example.admin.drawgroupchallenge.data.entities.Country
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val database: Database) : Repository {

    override fun insertCountry(country: Country) {
        Thread {
            database.countryMedalsDao().insertCountry(country)
        }.start()
    }

    override fun getMedals(): LiveData<List<Country>> = database.countryMedalsDao().getCountries()
}