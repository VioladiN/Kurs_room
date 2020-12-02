package com.violadin.kursroom.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.violadin.kursroom.database.AppDataBase
import com.violadin.kursroom.model.*

class FuelStationViewModel(application: Application): AndroidViewModel(application) {

    private val db = AppDataBase.getInstance(application.applicationContext).dao()
    private val dbClient = AppDataBase.getInstance(application.applicationContext).clientDao()
    private val dbOrders = AppDataBase.getInstance(application.applicationContext).orderDao()
    private val dbFuel = AppDataBase.getInstance(application.applicationContext).fuelDao()
    private val dbOrderContent = AppDataBase.getInstance(application.applicationContext).orderContentDao()

    fun insertClient(client: Client) {
        dbClient.insert(client)
    }

    fun insertOrder(order: Order) {
        dbOrders.insert(order)
    }

    fun insertOrderContent(orderContent: OrderContent) {
        dbOrderContent.insert(orderContent)
    }

    fun insertFuel(fuel: Fuel) {
        dbFuel.insert(fuel)
    }

    fun getAllOrders(): LiveData<List<AllOrders>> =
        db.getAllOrders()

    fun getTopTenClients(): LiveData<List<TopClients>> =
        db.getTopTenClients()

    fun getTopTenDates(): LiveData<List<TopDates>> =
        db.getTopTenDates()

}