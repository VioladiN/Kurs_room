package com.violadin.kursroom.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.violadin.kursroom.model.AllOrders
import com.violadin.kursroom.model.TopClients
import com.violadin.kursroom.model.TopDates

@Dao
interface Dao {

    @Query("SELECT c.name AS client, f.name AS fuel, oc.liters AS liters, o.dat_order AS date FROM `order` o LEFT JOIN client c ON o.id_client = c.id LEFT JOIN order_content oc ON o.id_order = oc.id_order LEFT JOIN fuel f ON oc.id_fuel = f.id")
    fun getAllOrders(): LiveData<List<AllOrders>>

    @Query("SELECT c.name AS client, sum(f.price_per_liter * oc.liters) AS total FROM client c LEFT JOIN `order` o ON c.id = o.id_client LEFT JOIN order_content oc ON o.dat_order = oc.id_order LEFT JOIN fuel f ON oc.id_fuel = f.id GROUP BY client ORDER BY total DESC LIMIT 10")
    fun getTopTenClients(): LiveData<List<TopClients>>

    @Query("SELECT o.dat_order, sum(f.price_per_liter * oc.liters) AS total, count(o.id_client) as count_clients FROM `order` o LEFT JOIN client c ON o.id_client = c.id LEFT JOIN order_content oc ON o.id_order = oc.id_order LEFT JOIN fuel f ON oc.id_fuel = f.id GROUP BY o.dat_order ORDER BY total DESC LIMIT 10")
    fun getTopTenDates(): LiveData<List<TopDates>>
}