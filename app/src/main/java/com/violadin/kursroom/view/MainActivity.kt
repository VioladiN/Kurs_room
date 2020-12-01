 package com.violadin.kursroom.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.violadin.kursroom.R
import com.violadin.kursroom.database.AppDataBase
import com.violadin.kursroom.fragment.AllOrdersListFragment
import com.violadin.kursroom.fragment.PopularTenClientsListFragment
import com.violadin.kursroom.fragment.PopularTenDateListFragment
import com.violadin.kursroom.model.Client
import com.violadin.kursroom.model.Fuel
import com.violadin.kursroom.model.Order
import com.violadin.kursroom.model.OrderContent
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

 class MainActivity : AppCompatActivity() {

     private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        openFragment(AllOrdersListFragment.newInstance())

//        val local1 = AppDataBase.getInstance(applicationContext).clientDao()
//        val local2 = AppDataBase.getInstance(applicationContext).fuelDao()
//        val local3 = AppDataBase.getInstance(applicationContext).orderDao()
//        val local4 = AppDataBase.getInstance(applicationContext).orderContentDao()
//        GlobalScope.launch {
//            local1.insert(Client(name = "Vlad"))
//            local2.insert(Fuel(name = "92", priceLitr = 45.0))
//            local3.insert(Order(date = 123, idClient = 1))
//            local4.insert(OrderContent(idOrder = 1, idFuel = 1, litr = 10.0))
//        }


        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.page1 -> {
                    Toast.makeText(applicationContext, "1", Toast.LENGTH_LONG).show()
                    openFragment(AllOrdersListFragment.newInstance())
                }
                R.id.page2 -> {
                    Log.i("123", "u are alive, dude?")
                    Toast.makeText(applicationContext, "2", Toast.LENGTH_LONG).show()
                    openFragment(PopularTenClientsListFragment.newInstance())
                }
                R.id.page3 -> {
                    Toast.makeText(applicationContext, "3", Toast.LENGTH_LONG).show()
                    openFragment(PopularTenDateListFragment.newInstance())
                }
            }
        }
    }

     fun openFragment(fragment: Fragment) {
         val transition = supportFragmentManager.beginTransaction()
         transition.replace(R.id.container, fragment)
         transition.addToBackStack(null)
         transition.commit()
     }
}