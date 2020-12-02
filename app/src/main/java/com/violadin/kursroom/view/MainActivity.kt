 package com.violadin.kursroom.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.violadin.kursroom.R
import com.violadin.kursroom.database.AppDataBase
import com.violadin.kursroom.fragment.AddOrderFragment
import com.violadin.kursroom.fragment.AllOrdersListFragment
import com.violadin.kursroom.fragment.PopularTenClientsListFragment
import com.violadin.kursroom.fragment.PopularTenDateListFragment
import com.violadin.kursroom.model.Client
import com.violadin.kursroom.model.Fuel
import com.violadin.kursroom.model.Order
import com.violadin.kursroom.model.OrderContent
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

 class MainActivity : AppCompatActivity() {

     private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openFragment(AllOrdersListFragment.newInstance())

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.page1 -> {
                    openFragment(AllOrdersListFragment.newInstance())
                }
                R.id.page2 -> {
                    openFragment(PopularTenClientsListFragment.newInstance())
                }
                R.id.page3 -> {
                    openFragment(PopularTenDateListFragment.newInstance())
                }
                R.id.page4 -> {
                    openFragment(AddOrderFragment.newInstance())
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