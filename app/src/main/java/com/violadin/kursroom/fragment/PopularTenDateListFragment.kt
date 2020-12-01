package com.violadin.kursroom.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.violadin.kursroom.R

class PopularTenDateListFragment: Fragment() {

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
        return view
    }
}