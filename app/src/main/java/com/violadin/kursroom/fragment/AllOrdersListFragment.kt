package com.violadin.kursroom.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.violadin.kursroom.R

class AllOrdersListFragment: Fragment() {

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
        return view
    }
}