package com.violadin.kursroom.model

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "order_content")
data class OrderContent(
    @ColumnInfo(name = "id_order") val idOrder: Int?,
    @ColumnInfo(name = "id_fuel") val idFuel: Int?,
    @ColumnInfo(name = "litr") val litr: Double?
    ) {
}