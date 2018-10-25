package com.example.admin.drawgroupchallenge.ui

import android.arch.lifecycle.ViewModel
import android.provider.ContactsContract
import com.example.admin.drawgroupchallenge.data.entities.Country
import com.example.admin.drawgroupchallenge.data.repository.RepositoryImpl

class AddCountryViewModel(val repository: RepositoryImpl) : ViewModel() {

    fun insertCountry(countryName: String, goldMedals: String, silverMedals: String, bronzeMedals: String) {
        val country = Country(
            countryName = countryName,
            goldMedals = goldMedals.toInt(),
            silverMedals = silverMedals.toInt(),
            bronzeMedals = bronzeMedals.toInt()
        )
        repository.insertCountry(country)
    }
}