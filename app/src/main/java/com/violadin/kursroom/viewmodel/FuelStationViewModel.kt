package com.violadin.kursroom.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.violadin.kursroom.database.AppDataBase
import com.violadin.kursroom.model.AllOrders
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FuelStationViewModel(application: Application): AndroidViewModel(application) {
    private val db = AppDataBase.getInstance(application.applicationContext).dao()
    internal val allOrders: LiveData<List<AllOrders>> = db.getAllOrders()

}