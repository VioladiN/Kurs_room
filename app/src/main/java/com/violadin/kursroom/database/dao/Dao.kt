package com.violadin.kursroom.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.violadin.kursroom.model.AllOrders
import com.violadin.kursroom.model.Order

@Dao
interface Dao {
    @Query("SELECT * FROM `order`")
    fun getClients(): List<Order>

        @Query("SELECT o.dat_order, c.name, oc.litr " +
                "FROM `order` o " +
                "LEFT JOIN clients c ON o.id_client = c.id " +
                "LEFT JOIN order_content oc ON oc.id_order = o.id_order " +
                "LEFT JOIN fuel f ON f.id = oc.id_fuel")
    fun getAllOrders(): LiveData<List<AllOrders>>
}