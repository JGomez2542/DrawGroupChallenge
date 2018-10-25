package com.example.admin.drawgroupchallenge.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.Index
import android.arch.persistence.room.PrimaryKey
import com.example.admin.drawgroupchallenge.utils.TABLE_NAME

@Entity(tableName = TABLE_NAME, indices = [Index("countryName", unique = true)])
data class Country(
    @PrimaryKey(autoGenerate = true)
    val countryId: Int? = null,
    val countryName: String,
    val goldMedals: Int,
    val silverMedals: Int,
    val bronzeMedals: Int,
    val totalMedals: Int = goldMedals + silverMedals + bronzeMedals)