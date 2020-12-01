package com.violadin.kursroom.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "order")
data class Order(
    @PrimaryKey(autoGenerate = true) val id_order: Int? = null,
    @ColumnInfo(name = "dat_order") val date: Date,
    @ColumnInfo(name = "id_client") val idClient: Int?
    ) {
}