package com.violadin.kursroom.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.violadin.kursroom.model.Fuel

@Dao
interface FuelDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(fuel: Fuel)
}