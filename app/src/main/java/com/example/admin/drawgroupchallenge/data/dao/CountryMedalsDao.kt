package com.example.admin.drawgroupchallenge.data.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import com.example.admin.drawgroupchallenge.data.entities.Country

@Dao
interface CountryMedalsDao {

    @Insert(onConflict = OnConflictStrategy.FAIL)
    fun insertCountry(country: Country)

    @Update
    fun updateCountry(country: Country)

    @Delete
    fun deleteCountry(country: Country)

    @Query("SELECT * FROM CountryMedals ORDER BY totalMedals DESC")
    fun getCountries(): LiveData<List<Country>>
}