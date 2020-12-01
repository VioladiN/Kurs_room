package com.violadin.kursroom.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.violadin.kursroom.model.OrderContent

@Dao
interface OrderContentDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(orderContent: OrderContent)
}