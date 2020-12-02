package com.violadin.kursroom.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.violadin.kursroom.model.AllOrders
import com.violadin.kursroom.model.TopClients

@Dao
interface Dao {

    @Query("SELECT c.name, f.name, oc.liters, o.dat_order FROM `order` o LEFT JOIN client c ON o.id_client = c.id LEFT JOIN order_content oc ON o.id_order = oc.id_order LEFT JOIN fuel f ON oc.id_fuel = f.id")
    fun getAllOrders(): LiveData<List<AllOrders>>

    @Query("SELECT c.name, sum(f.price_per_liter * oc.liters) AS total FROM client c LEFT JOIN `order` o ON c.id = o.id_client LEFT JOIN order_content oc ON o.dat_order = oc.id_order LEFT JOIN fuel f ON oc.id_fuel = f.id GROUP BY c.name ORDER BY total DESC")
    fun getTopTenClients(): LiveData<List<TopClients>>
}