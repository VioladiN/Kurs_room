package com.violadin.kursroom.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.violadin.kursroom.model.AllOrders
import com.violadin.kursroom.model.Order

@Dao
interface Dao {
    @Query("SELECT * FROM `order`")
    fun getClients(): List<Order>

    @Query("SELECT dat_order, c.name, f.name, oc.litr FROM `order` o LEFT JOIN clients c ON c.id = o.id_client LEFT JOIN order_content oc ON oc.id_order = o.dat_order LEFT JOIN fuel f ON f.id = oc.id_fuel")
    fun getAllOrders(): List<AllOrders>
}