package com.violadin.kursroom.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "order_content")
data class OrderContent(
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    @ColumnInfo(name = "id_order") val id_order: Int?,
    @ColumnInfo(name = "id_fuel") val id_fuel: Int?,
    @ColumnInfo(name = "liters") val liters: Double?
    ) {
}