package com.violadin.kursroom.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.violadin.kursroom.R
import com.violadin.kursroom.adabter.PopularTenClientsAdabter
import com.violadin.kursroom.adabter.PopularTenDateAdabter
import com.violadin.kursroom.viewmodel.FuelStationViewModel

class PopularTenDateListFragment: Fragment() {

    private lateinit var model: FuelStationViewModel

    companion object {
        fun newInstance(): PopularTenDateListFragment {
            return PopularTenDateListFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?):
            View? {
        val view = inflater.inflate(R.layout.pop_date_activity, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.list_date)
        val linearLayoutManager = LinearLayoutManager(view.context,
                RecyclerView.VERTICAL, false)
        recyclerView.layoutManager = linearLayoutManager

        model = ViewModelProvider(this).get(FuelStationViewModel::class.java)

//        model.topDates.observe(viewLifecycleOwner, {
//            allDates -> recyclerView.adapter = PopularTenDateAdabter(allDates)
//        })
        return view
    }
}