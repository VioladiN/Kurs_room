package com.violadin.kursroom.database


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.violadin.kursroom.database.dao.*
import com.violadin.kursroom.model.Client
import com.violadin.kursroom.model.Fuel
import com.violadin.kursroom.model.Order
import com.violadin.kursroom.model.OrderContent


@Database(entities = [Client::class, Fuel::class, Order::class, OrderContent::class], version = 5)
abstract class AppDataBase: RoomDatabase() {
    abstract fun dao(): Dao
    abstract fun clientDao(): ClientDao
    abstract fun fuelDao(): FuelDao
    abstract fun orderDao(): OrderDao
    abstract fun orderContentDao(): OrderContentDao

    companion object {
        @Volatile
        private var INSTANCE: AppDataBase? = null
        fun getInstance(context: Context): AppDataBase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDataBase(context).also { INSTANCE = it }
            }

        private fun buildDataBase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AppDataBase::class.java, "app.db"
            )
                .build()
    }
}