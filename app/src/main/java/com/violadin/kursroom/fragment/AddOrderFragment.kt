package com.violadin.kursroom.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.violadin.kursroom.R
import com.violadin.kursroom.viewmodel.FuelStationViewModel

class AddOrderFragment: Fragment() {

    private lateinit var model: FuelStationViewModel

    companion object {
        fun newInstance(): AddOrderFragment {
            return AddOrderFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?):
            View? {
        val view = inflater.inflate(R.layout.addorder_activity, container, false)
        model = ViewModelProvider(this).get(FuelStationViewModel::class.java)

        val button = view.findViewById<Button>(R.id.btn_add_client)
        val editTextNamePerson = view.findViewById<EditText>(R.id.ev_client_name)
        val editTextDate = view.findViewById<EditText>(R.id.ev_date)
        val editTextFuelType = view.findViewById<EditText>(R.id.ev_type_fuel)
        val editTextLiters = view.findViewById<EditText>(R.id.ev_liters)

        button.setOnClickListener {

        }

        return view
    }
}