package com.violadin.kursroom.fragment

import android.os.Bundle
import android.os.RecoverySystem
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.violadin.kursroom.R
import com.violadin.kursroom.adabter.AllOrdersListAdabter
import com.violadin.kursroom.viewmodel.FuelStationViewModel

class AllOrdersListFragment: Fragment() {

    private lateinit var model: FuelStationViewModel

    companion object {
        fun newInstance(): AllOrdersListFragment {
            return AllOrdersListFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?):
            View? {
        val view = inflater.inflate(R.layout.list_orders_activity, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.list_orders)
        val linearLayoutManager = LinearLayoutManager(view.context,
            RecyclerView.VERTICAL, false)
        recyclerView.layoutManager = linearLayoutManager
        model = ViewModelProvider(this).get(FuelStationViewModel::class.java)

        model.getAllOrders().observe(viewLifecycleOwner, {
            allOrders -> recyclerView.adapter = AllOrdersListAdabter(allOrders)
        })
        return view
    }
}