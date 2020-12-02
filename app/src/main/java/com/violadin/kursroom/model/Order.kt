package com.violadin.kursroom.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.OffsetDateTime
import java.util.*

@Entity(tableName = "order")
data class Order(
    @PrimaryKey(autoGenerate = true) val id_order: Int? = null,
    @ColumnInfo(name = "dat_order") val dat_order: Date?,
    @ColumnInfo(name = "id_client") val id_client: Int?
    ) {
}