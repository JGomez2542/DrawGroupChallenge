package com.example.admin.drawgroupchallenge.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.admin.drawgroupchallenge.data.dao.CountryMedalsDao
import com.example.admin.drawgroupchallenge.data.entities.Country
import com.example.admin.drawgroupchallenge.utils.DATABASE_VERSION

@Database(entities = [Country::class], version = DATABASE_VERSION)
abstract class Database : RoomDatabase() {
    abstract fun countryMedalsDao(): CountryMedalsDao
}