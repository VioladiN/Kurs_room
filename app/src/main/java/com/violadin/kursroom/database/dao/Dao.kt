package com.violadin.kursroom.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.violadin.kursroom.model.AllOrders
import com.violadin.kursroom.model.Order
import com.violadin.kursroom.model.TopClients

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

    @Query("SELECT c.name, sum(f.price_per_litr * oc.litr) AS total FROM clients c LEFT JOIN `order` o ON c.id = o.id_client LEFT JOIN order_content oc ON o.id_order = oc.id_order LEFT JOIN fuel f ON oc.id_fuel = f.id GROUP BY c.name ORDER BY total DESC")
    fun getTopTenClients() : LiveData<List<TopClients>>
}