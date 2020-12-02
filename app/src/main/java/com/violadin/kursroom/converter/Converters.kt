package com.violadin.kursroom.converter

import androidx.room.TypeConverter
import java.math.BigDecimal
import java.util.*

class Converters {
    companion object {
        @TypeConverter
        @JvmStatic
        fun fromBigDecimal(value: BigDecimal): String {
            return value.toString()
        }

        @TypeConverter
        @JvmStatic
        fun toBigDecimal(value: String): BigDecimal {
            return value.toBigDecimal()
        }

        @TypeConverter
        @JvmStatic
        fun toDate(value:Long): Date {
            return Date(value*1000L)
        }

        @TypeConverter
        @JvmStatic
        fun fromDate(date:Date): Long {
            return date.time
        }
    }
}