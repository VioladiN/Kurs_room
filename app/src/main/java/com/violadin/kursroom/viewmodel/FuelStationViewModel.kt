package com.violadin.kursroom.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.violadin.kursroom.database.AppDataBase
import com.violadin.kursroom.model.Client

class FuelStationViewModel(application: Application): AndroidViewModel(application) {

    private val db = AppDataBase.getInstance(application.applicationContext).dao()
    private val dbClient = AppDataBase.getInstance(application.applicationContext).clientDao()
    private val dbOrders = AppDataBase.getInstance(application.applicationContext).orderDao()
    private val dbFuel = AppDataBase.getInstance(application.applicationContext).fuelDao()
    private val dbOrderContent = AppDataBase.getInstance(application.applicationContext).orderContentDao()

//    internal val allOrders: LiveData<List<AllOrders>> = db.getAllOrders()
//    internal val topClients: LiveData<List<TopClients>> = db.getTopTenClients()
//    internal val topDates: LiveData<List<TopDates>> = db.getTopTenDates()

    fun insertClient(client: Client) {
        dbClient.insert(client)
    }
}